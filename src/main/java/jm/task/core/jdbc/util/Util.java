package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String HOSTNAME = "127.0.0.1";
    private static final String DBNAME = "mydatabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection getMyConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        String connectionURL = "jdbc:mysql://" + HOSTNAME + ":3306/" + DBNAME;

        Connection conn = DriverManager.getConnection(connectionURL, USERNAME, PASSWORD);
        return conn;
    }

}
