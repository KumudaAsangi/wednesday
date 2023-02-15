package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Patientdao;
@WebServlet("/pmc")
public class Mainclass extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		
		String str1=req.getParameter("Id");
		int st1=Integer.parseInt(str1);
		System.out.println(st1);
		
		String str2=req.getParameter("Name");
		System.out.println(str2);
		
		String str3=req.getParameter("bg");
		System.out.println(str3);
		
		Patient patient=new Patient();
		patient.setId(st1);
		patient.setName(str2);
		patient.setBg(str3);
		
		
		
//		resp.getWriter().print("Hello");
		
		Patientdao patientdao=new Patientdao();
		patientdao.insert(patient);
		
	}
	

}
