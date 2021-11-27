package com.servlet.practice;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/annotation")
public class Annotation extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.getWriter().print("Hi Karthi");
	}
}
