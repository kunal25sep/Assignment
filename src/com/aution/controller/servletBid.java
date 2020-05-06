package com.aution.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aution.dao.DoaBid;
import com.aution.model.ModelBid;

@WebServlet("/servletBid")

public class servletBid extends HttpServlet {

	private static final long versionserialUID = 1L;
	
	private DoaBid dao = new DoaBid();
	
	public servletBid() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher= request.getRequestDispatcher("/WEB-INF/views/Bidder.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName= request.getParameter("userName");
		String amount= request.getParameter("amount");
		String email= request.getParameter("email");
		String phoneNumber= request.getParameter("phoneNumber");
		String address= request.getParameter("address");
		
		ModelBid bidder = new ModelBid();
		
		bidder.setUserName(userName);
		bidder.setAmount(amount);
		bidder.setEmail(email);
		bidder.setPhoneNumber(phoneNumber);
		bidder.setAddress(address);
		
		
		DoaBid doabid = new DoaBid();
		try {
//			bidder.createBid(bidder);
			doabid.bidCreated(bidder);
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
