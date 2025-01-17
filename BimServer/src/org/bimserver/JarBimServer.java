package org.bimserver;

import java.nio.file.Paths;

import org.bimserver.resources.JarResourceFetcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JarBimServer {
	private static final Logger LOGGER = LoggerFactory.getLogger(JarBimServer.class);
	private BimServer bimServer;

	public static void main(String[] args) {
		String address = "127.0.0.1";
		String port = "8082";
		String homedir = "home";
		for (String arg : args) {
			if (arg.startsWith("address=")) {
				address = arg.substring(8);
				if (address.startsWith("\"") && address.endsWith("\"")) {
					address = address.substring(1, address.length() - 1);
				}
			} else if (arg.startsWith("port=")) {
				port = arg.substring(5);
				if (port.startsWith("\"") && port.endsWith("\"")) {
					port = port.substring(1, port.length() - 1);
				}
			} else if (arg.startsWith("homedir=")) {
				homedir = arg.substring(8);
				if (homedir.startsWith("\"") && homedir.endsWith("\"")) {
					homedir = homedir.substring(1, homedir.length() - 1);
				}
			}
		}
		final JarBimServer server = new JarBimServer();
		server.start(address, Integer.parseInt(port), homedir, "www");
	}

	public void stop() {
		LOGGER.info("Stopping server...");
		try {
			bimServer.stop();
		} catch (Exception e) {
			LOGGER.error("", e);
		}
		LOGGER.info("Server stopped successfully");
	}

	public void start(String address, int port, String homedir, String resourceBase) {
		// Strange hack needed for OSX
		if (homedir.startsWith("\"") && homedir.endsWith("\"")) {
			homedir = homedir.substring(1, homedir.length()-2);
		}
		System.setProperty("org.apache.cxf.Logger", "org.apache.cxf.common.logging.Log4jLogger");
		BimServerConfig bimServerConfig = new BimServerConfig();
		bimServerConfig.setHomeDir(Paths.get(homedir));
		bimServerConfig.setResourceFetcher(new JarResourceFetcher());
		bimServerConfig.setStartEmbeddedWebServer(true);
		bimServerConfig.setPort(port);
		bimServerConfig.setClassPath(System.getProperty("java.class.path"));
		bimServer = new BimServer(bimServerConfig);
	 	try {
	 		LOGGER.debug("Setting resourcebase to www");
	 		bimServer.getEmbeddedWebServer().getContext().setResourceBase("www");
	 		LOGGER.debug("Loading plugins");
	 		bimServer.getPluginManager().loadAllPluginsFromDirectoryOfJars(Paths.get("plugins"));
			bimServer.start();
			LOGGER.info("Server started successfully");
		} catch (Exception e) {
			LOGGER.error("", e);
		}
	}
}