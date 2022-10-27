package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		int result = 0;
		String operation = request.getParameter("operation");
		
		switch (operation) {
		case "+": {
			result = number1 + number2;
			break;
		}
		case "-": {
			result = number1 - number2;
			break;
		}
		case "*": {
			result = number1 * number2;
			break;
		}
		case "/": {
			result = number1 / number2;
			break;
		}
		default:
			out.print("<h1>Invalid Operation</h1>");
		}
		
		out.print("<h1>" + number1 + operation + number2 + "=" +result+"</h1>");
		
	}

}