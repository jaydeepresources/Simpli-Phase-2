package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String operation = request.getParameter("operation");

		switch (operation) {
		case "sign in":

			RequestDispatcher rd1 = request.getRequestDispatcher("SignInServlet");
			rd1.forward(request, response);

			break;

		case "sign up":

			RequestDispatcher rd2 = request.getRequestDispatcher("SignUpServlet");
			rd2.forward(request, response);

			break;

		case "add":

			RequestDispatcher rd3 = request.getRequestDispatcher("AddServlet");
			rd3.forward(request, response);

			break;

		default:
			break;
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String operation = request.getParameter("operation");

		switch (operation) {

		case "add":

			RequestDispatcher rd3 = request.getRequestDispatcher("AddServlet");
			rd3.forward(request, response);

			break;

		default:
			break;
		}

	}

}
