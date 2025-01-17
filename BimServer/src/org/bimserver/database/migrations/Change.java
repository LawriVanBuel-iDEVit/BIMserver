package org.bimserver.database.migrations;

import org.bimserver.BimserverDatabaseException;
import org.bimserver.database.Database;
import org.bimserver.database.DatabaseSession;

public interface Change {

	void change(Database database, DatabaseSession databaseSession) throws NotImplementedException, BimserverDatabaseException;
}