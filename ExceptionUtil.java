package com.wipro.employee.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionUtil {

	public Connection getConnection() throws ClassNotFoundException,SQLException
	{
		Class.forName("oracle.jdbc.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
		String username = "scott";
		String pwd = "wipro123";
	  Connection conn = DriverManager.getConnection(url,username,pwd);
	  return conn;
		
	}
}
