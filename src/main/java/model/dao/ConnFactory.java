package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author frizzocamila
 */
public class ConnFactory {
    public static Connection getConnection() throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/agenda", "root", "fisica1997");
        return conn;
    }
}
