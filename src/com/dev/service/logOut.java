package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Test5Servlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(false);
		
		if(session != null && session.getAttribute("id") != null)
		{
			 session.invalidate();
			 out.print( "로그 아 웃 작업을 완료하였습니다.");
			 
		}
		else
			out.print("현재 로그인 상태가 아닙니다.");
			out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		if(id.isEmpty() || pwd .isEmpty())
		{
			out.print("ID 또는 비밀번호를 입력해 주세요. ");
			out.close();
			return;
			
		}
		
		HttpSession session = req.getSession();
		if(session.isNew() || session.getAttribute("id") == null)
			
		{
				session.setAttribute("id", id);
				out.print("로그인을 완료하였습니다.");
				
		}
		
		else
			out.print("현재 로그인 상태입니다");
		out.close();
		}
	
		
	}
 

