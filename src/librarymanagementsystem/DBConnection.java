package librarymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public Connection con;

    {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "supriya");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}

