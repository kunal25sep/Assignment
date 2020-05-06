package com.training.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToSql {

	public static Connection getConnection() {
	/*{
		String url="jdbc:sqlserver://127.0.0.1;databaseName=OnlineAuction;";
		String user="sa";
		String password="Pit.van-11";	
		DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
		Connection connection=DriverManager.getConnection(url, user, password);
		
		System.out.println("connection is creating");
		return connection;
	}*/
	
	 String URL = "jdbc:mysql://localhost/OnlineAuction?useUnicode=true&amp;useJDBCCompliantTimezoneShift=true&amp;useLegacyDatetimeCode=false&amp;serverTimezone=UTC";
	   String USER = "root";
	   String PASS = "root";
	   
	   Connection conn = null;
	   Driver myDriver = null;
	   try {
		   
	   myDriver= new com.mysql.jdbc.Driver();
	   DriverManager.registerDriver( myDriver );
	
		conn = DriverManager.getConnection(URL, USER, PASS);
		System.out.println("connection is creating");
	} catch (Exception e) {
		e.printStackTrace();
	}
	   return conn;
	   
 }
}
