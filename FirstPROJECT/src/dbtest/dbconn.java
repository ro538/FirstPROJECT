package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbconn {

	
	public static Connection getDb() throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection s=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","");	
		return s;	
	}
	
	
	
}
