package main;
import java.io.PrintWriter;
import java.sql.*;

public class Users {
	
	public void signInUser() {

		System.out.println("Signing in user.");

		/*
		System.out.println("Page loaded!");

		PrintWriter writer = response.getWriter();
		writer.println("<p>Database query 3.</p>");

		String driver = "com.mysql.jdbc.Driver";
		String db_url = "jdbc:mysql://92.222.90.41:3306/mango";

		String user = "root";
		String pass = "admin";

		try{
			Class.forName(driver);

			Connection conn = DriverManager.getConnection(db_url, user, pass);

			Statement stmt = conn.createStatement();
			String sql;
			sql = "SELECT * FROM notes";
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next()){
				String note = rs.getString("note");
				writer.println("<li>" + note + "</li>");
			}

			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {e.printStackTrace();}
		*/
	}

}