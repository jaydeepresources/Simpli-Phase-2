package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String firstname = request.getParameter("firstname");

		String password = request.getParameter("password");
		out.print("Password=" + password);


		
		HttpSession session = request.getSession();

		out.print("<h2>Firstname=" + firstname + "</h2>");

		if (firstname != null && firstname.length() > 0)
			session.setAttribute("firstname", firstname);

		out.print("Session Id=" + session.getId());
		out.print("<h2>Session's Firstname=" + session.getAttribute("firstname") + "</h2>");
	}

}
