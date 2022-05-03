package com.bjpowernode.webapp.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/myservlet/test")
public class MyServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        Date date=new Date();

        out.println("Sign Success...<br>"+date.toString());
    }
}
