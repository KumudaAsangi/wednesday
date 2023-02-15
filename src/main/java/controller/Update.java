package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Patientdao;
@WebServlet("/abc")
public class Update extends HttpServlet{
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=req.getParameter("Id");
		String s2=req.getParameter("bg");
		
		Patientdao patientdao=new Patientdao();
		patientdao.update(s1,s2);
	}

}
