package com.karthi;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Addition extends HttpServlet {
	// service -> It can handle both Get and Post. By Default it is Get method.
	// doGet -> It will handle only Get method
	// doPost -> It will handle only Post method
	// Session Management -> Implemented using RequestDispatcher, sendRedirect
	// RequestDispatcher will send value from one servlet to another without notifing user.
	// sendRedirect will notify user that it is redirected to another servlet.
	// Session Management types -> URL ReWriting, Session, Cookies
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
	 // res.getWriter().println("Result : " + k); -> to print result of addition.

		
	// Session Management-> Using RequestDispatcher
		// req.setAttribute("key", k);
		// RequestDispatcher rd = req.getRequestDispatcher("sqr"); //Pass Url value
		// rd.forward(req , res);
		
		
	// Session Management-> Using URL ReWriting
		//res.sendRedirect("sqr?k=" + k); // URL ReWriting
		
	// Session Management-> Using HttpSession
		//HttpSession session = req.getSession();
		//session.setAttribute("key", k);
		//res.sendRedirect("sqr");
		
	// Session Management-> Using Cookies
		Cookie cookie = new Cookie("key", String.valueOf(k));
		res.addCookie(cookie);
		res.sendRedirect("sqr");
	}
}
