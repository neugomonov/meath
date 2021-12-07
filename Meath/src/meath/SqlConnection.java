package meath;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {

    public static Connection Connector() {
        try {
            String s = "jdbc:mysql://localhost:4306/meath?zeroDateTimeBehavior=CONVERT_TO_NULL";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection(s, "root", "");
//          JOptionPane.showMessageDialog(null, "Connected");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(" " + e);
            return null;
        }
    }
}
