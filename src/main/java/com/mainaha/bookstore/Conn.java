package com.mainaha.bookstore;

import java.sql.*;

public class Conn {
	Connection c;
	Statement s;

	public Conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/2026_library_management_system","****","*****");
			s = c.createStatement();
			
		} catch(Exception e) {
			System.out.println(e); 
		}
	}
	
}