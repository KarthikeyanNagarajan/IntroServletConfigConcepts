package com.karthi;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Square extends HttpServlet {
	// service -> It can handle both Get and Post. By Default it is Get method.
	// doGet -> It will handle only Get method
	// doPost -> It will handle only Post method
	// Session Management -> Implemented using RequestDispatcher, sendRedirect
	// RequestDispatcher will send value from one servlet to another without notifing user.
	// sendRedirect will notify user that it is redirected to another servlet.
	// Session Management types -> URL ReWriting, HttpSession, Cookies
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	// Session Management-> Using RequestDispatcher
		//int l = (int) req.getAttribute("key");
		//l = l * l;
		//res.getWriter().println("Result : " + l);
		
	// Session Management-> Using sendRedirect (URL ReWriting)
		//int l = Integer.parseInt(req.getParameter("k"));
		//l = l * l;
		//res.getWriter().println("Result : " + l);
		
	// Session Management-> Using HttpSession
		//HttpSession session = req.getSession();
		//int l = (int) session.getAttribute("key");
		//l = l * l;
		//res.getWriter().println("Result : " + l);
		
	// Session Management-> Using Cookies
		int l = 0;
		Cookie cookie[] = req.getCookies();
		for (Cookie c : cookie) {
			if (c.getName().equalsIgnoreCase("key")) {
				l = Integer.parseInt(c.getValue());
			}
		}
		l = l * l;
		res.getWriter().println("Result : " + l);
	}
}
