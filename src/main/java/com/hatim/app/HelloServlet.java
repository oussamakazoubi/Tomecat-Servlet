package com.hatim.app;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HelloServlet extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
		String yourname = req.getParameter("your_name");
        out.write("<h1>Hello Servlet with 'web.xml configuration'</h1>");
		out.write("<h2>Hello "+yourname+"</h2>");
		out.close();
    }

}
