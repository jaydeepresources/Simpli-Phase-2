package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		float price = Float.parseFloat(request.getParameter("price"));

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded.");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "blackthorne");
			System.out.println("Connection is established.");

			Statement st = con.createStatement();
			int res = st.executeUpdate("insert into books values(" + id + ",'" + name + "'," + price + ")");
			out.print("<h2>Rows Inserted: " + res + "</h2>");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
