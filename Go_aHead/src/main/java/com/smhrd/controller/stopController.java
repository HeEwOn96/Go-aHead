package com.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.smhrd.dao.UseDAO;
import com.smhrd.domain.UseVO;


@WebServlet("/stop.do")
public class stopController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/json;charset=utf-8");
		
		String mem_id = request.getParameter("mem_id");
		System.out.println("ajax통신 성공");
		System.out.println(mem_id);
		
		UseDAO dao = new UseDAO();
		dao.stop(mem_id);
		
		//Gson g = new Gson();
//		String json = g.toJson(result);
//		System.out.println("json성공!");
//	    PrintWriter out =response.getWriter();
//	    response.setContentType("text/json;charset=utf-8");
//	    out.println(json);

	
	
	
	
	}

}