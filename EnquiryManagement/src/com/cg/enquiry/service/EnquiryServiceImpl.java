package com.cg.enquiry.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.cg.enquiry.dao.EnquiryDAOImpl;
import com.cg.enquiry.dao.IEnquiryDAO;
import com.cg.enquiry.dto.EnquiryInfo;



public class EnquiryServiceImpl implements IEnquiryService {
	IEnquiryDAO dao=null;
	
	public int addEnquiryDetails(EnquiryInfo e) throws IOException, SQLException {
		dao=new EnquiryDAOImpl();
		return dao.addEnquiryDetails(e);
}
	public ArrayList<EnquiryInfo> retrieveDetails(int a) throws SQLException, IOException {
		IEnquiryDAO dao=new EnquiryDAOImpl();
		return dao.retrieveDetails(a);
	
	}
	@Override
	public ArrayList<EnquiryInfo> retrieveDetails() throws SQLException,
			IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean validateFName(String fname)
	{
		if(fname.isEmpty())
		{
			System.out.println("It should not be empty");
			return false;
		}
		else
		{
			
			return true;
		}																		
	}
	public boolean validateLName(String lname)
	{
		if(lname.isEmpty())
		{
			System.out.println("It should not be empty");
			return false;
		}
		else
		{
			
			return true;
		}																		
	}	
	public boolean validatePDomain(String pdomain)
	{
		if(pdomain.isEmpty())
		{
			System.out.println("It should not be empty");
			return true;
		}
		else
		{
			
			return false;
		}																		
	}	
	public boolean validatedomain(String domain)
	{
		if(domain.isEmpty())
		{
			System.out.println("It should not be empty");
			return true;
		}
		else
		{
			return false;
		}																		
	}
	
	
	}

