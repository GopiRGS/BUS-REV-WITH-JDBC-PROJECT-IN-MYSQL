package BusResv;
import java.sql.*;
public class DbConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/BusRev"; // Make sure this is the correct DB
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Velavan@2019";
	
    public static Connection getConnection() throws SQLException {
    	return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }
}










