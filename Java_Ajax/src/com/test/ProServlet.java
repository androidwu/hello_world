package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/proServlet")
public class ProServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("utf-8");	
		
		PrintWriter pw=resp.getWriter();
		
		String pro=req.getParameter("pro");
		
		if("sx".equals(pro)){
			
			pw.write("太原市");
			
		}else if("bj".equals(pro)){
			
			pw.write("海淀区");
		}
		
	}

}
