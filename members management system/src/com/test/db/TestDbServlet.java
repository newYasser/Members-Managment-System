package com.test.db;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = "member";
		String pass = "member";
		String jdbcUrl = "jdbc:mysql://localhost:3306/members_management_system?useSSL=false";
		
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			
			PrintWriter out = response.getWriter();
			out.println("Connecting to database...");
			
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(jdbcUrl,user,pass);
			
			out.println("Connected to database");
			conn.close();
		}
		catch(Exception e) {
			 e.printStackTrace();
			 throw new ServletException(e);
		}
		
		
	}

}
