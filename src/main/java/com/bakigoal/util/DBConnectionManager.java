package com.bakigoal.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by ilmir on 04.07.16.
 */
public class DBConnectionManager {

  private Connection connection;

  public DBConnectionManager(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException {
    Class.forName("org.postgresql.Driver");
    this.connection = DriverManager.getConnection(dbURL, user, pwd);
  }

  public Connection getConnection() {
    return this.connection;
  }
}
