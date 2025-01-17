package org.bimserver.test.framework;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

import org.bimserver.BimServer;
import org.bimserver.BimServerConfig;
import org.bimserver.EmbeddedWebServer;
import org.bimserver.LocalDevPluginLoader;
import org.bimserver.models.store.ServerState;
import org.bimserver.plugins.PluginManager;
import org.bimserver.servlets.StreamingServlet;
import org.bimserver.shared.LocalDevelopmentResourceFetcher;
import org.bimserver.shared.interfaces.AdminInterface;
import org.bimserver.shared.interfaces.SettingsInterface;
import org.bimserver.utils.PathUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestFramework {
	private static final Logger LOGGER = LoggerFactory.getLogger(TestFramework.class);
	
	private final Set<VirtualUser> virtualUsers = new HashSet<VirtualUser>();
	private final TestConfiguration testConfiguration;
	private final TestResults testResults = new TestResults();
	private BimServer bimServer;

	private Path[] pluginDirectories;

	public TestFramework(TestConfiguration testConfiguration, Path[] pluginDirectories) {
		this.testConfiguration = testConfiguration;
		this.pluginDirectories = pluginDirectories;
	}
	
	public void start() {
		if (testConfiguration.isStartEmbeddedBimServer()) {
			if (testConfiguration.isCleanEnvironmentFirst()) {
				try {
					if (Files.isDirectory(testConfiguration.getHomeDir())) {
						PathUtils.removeDirectoryWithContent(testConfiguration.getHomeDir());
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			BimServerConfig bimServerConfig = new BimServerConfig();
			bimServerConfig.setStartEmbeddedWebServer(true);
			bimServerConfig.setHomeDir(testConfiguration.getHomeDir());
			bimServerConfig.setPort(8080);
			bimServerConfig.setResourceFetcher(new LocalDevelopmentResourceFetcher(Paths.get("../")));
			bimServerConfig.setClassPath(System.getProperty("java.class.path"));
			bimServer = new BimServer(bimServerConfig);
			EmbeddedWebServer embeddedWebServer = bimServer.getEmbeddedWebServer();
		 	embeddedWebServer.getContext().addServlet(StreamingServlet.class, "/stream/*");
			try {
				LocalDevPluginLoader.loadPlugins(bimServer.getPluginManager(), pluginDirectories);
				bimServer.start();
				// Convenience, setup the server to make sure it is in RUNNING state
				if (bimServer.getServerInfo().getServerState() == ServerState.NOT_SETUP) {
					bimServer.getService(AdminInterface.class).setup("http://localhost", "localhost", "no-reply@bimserver.org", "Administrator", "admin@bimserver.org", "admin");
					bimServer.getService(SettingsInterface.class).setGenerateGeometryOnCheckin(false);
					bimServer.getService(SettingsInterface.class).setSendConfirmationEmailAfterRegistration(false);
				}
				
				// Change a setting so normal users can create projects
				bimServer.getService(SettingsInterface.class).setAllowUsersToCreateTopLevelProjects(true);
			} catch (Exception e) {
				LOGGER.error("", e);
			}
		}
		if (!Files.exists(testConfiguration.getOutputFolder())) {
			try {
				PathUtils.removeDirectoryWithContent(testConfiguration.getOutputFolder());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		VirtualUserFactory virtualUserFactory = new VirtualUserFactory(this, testConfiguration.getBimServerClientFactory());
		for (int i=0; i<testConfiguration.getNrVirtualUsers(); i++) {
			VirtualUser virtualUser = virtualUserFactory.create("Virtual User " + i);
			virtualUsers.add(virtualUser);
		}
		for (VirtualUser virtualUser : virtualUsers) {
			virtualUser.start();
		}
		org.bimserver.CommandLine commandLine = new org.bimserver.CommandLine(bimServer);
		commandLine.start();
	}

	public synchronized Path getTestFile() {
		return testConfiguration.getTestFileProvider().getNewFile();
	}

	public synchronized void unsubsribe(VirtualUser virtualUser) {
		virtualUsers.remove(virtualUser);
		if (virtualUsers.isEmpty() && testConfiguration.isStopNoVirtualUsers()) {
			if (testConfiguration.isStartEmbeddedBimServer()) {
				bimServer.stop();
			}
		}
	}

	public TestConfiguration getTestConfiguration() {
		return testConfiguration;
	}

	public void stop() {
		for (VirtualUser virtualUser : virtualUsers) {
			virtualUser.shutdown();
		}
		if (testConfiguration.isStartEmbeddedBimServer()) {
			bimServer.stop();
		}
	}

	public void standby() {
		for (VirtualUser virtualUser : virtualUsers) {
			virtualUser.shutdown();
		}
	}

	public TestResults getResults() {
		return testResults;
	}

	public PluginManager getPluginManager() {
		return bimServer.getPluginManager();
	}
}