package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectivity {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	 	Class.forName("com.mysql.cj.jdbc.Driver");
	 	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bhupe","root","bhupe");
		System.out.println("Connection Established");
	}
}
