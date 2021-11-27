package com.karthi;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{

	//ServletContext uses param values from context-param which is common to all servlets.
	//ServletConfig uses param values from init-param which is specific to that servlet.
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//Using ServletContext
		res.getWriter().print("Hi ");
		ServletContext context = getServletContext();
		String name = context.getInitParameter("name");
		res.getWriter().println(name);
		
		
		//Using ServletConfig
		res.getWriter().print("Hi ");
		ServletConfig context1 = getServletConfig();
		String name1 = context1.getInitParameter("name");
		res.getWriter().println(name1);
	}
}
