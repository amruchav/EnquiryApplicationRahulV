package com.cg.enquiry.UI;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.enquiry.dto.EnquiryInfo;
import com.cg.enquiry.exception.EnquiryApplicationException;
import com.cg.enquiry.service.EnquiryServiceImpl;
import com.cg.enquiry.service.IEnquiryService;


public class EnquiryUI {
	static Scanner sc=new Scanner(System.in);
	static int choice=0;
	static EnquiryInfo details=null;
	static EnquiryServiceImpl Service= new EnquiryServiceImpl();
	public static void main(String[] args) throws SQLException, IOException{
		
		System.out.println("Enquiry Application \n **********");
		while(true)
		{
			System.out.println("1.Enter Enquiry Details:");
			System.out.println("2.View the entered enquiry Details:");
			System.out.println("3.Exit:");
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:getEnquiryDetails();
			break;
			case 2:viewEnquiryDetails();
			break;
			case 3:
				System.exit(0);
				break;
			}
			
		}
	}
	
	private static void viewEnquiryDetails() throws SQLException, IOException {
		
		ArrayList<EnquiryInfo> list=null;
		System.out.println("Enter the enquiry id");
		int a=sc.nextInt();
		list=Service.retrieveDetails(a);
		for(EnquiryInfo m:list)
		{
			System.out.println(m.getEnquiryId());
			System.out.println(m.getFirstName());
			System.out.println(m.getLastName());
			System.out.println(m.getPreferredDomain());
			System.out.println(m.getDomain());
		}
}

	private static void getEnquiryDetails() throws IOException, SQLException {
		
		sc.nextLine();
		Service=new EnquiryServiceImpl();
		System.out.println("Enter first Name:");
		String fname=sc.nextLine();
		if(Service.validateFName(fname))
		{
		System.out.println("Enter Last name:");
		String lname=sc.nextLine();
		if(Service.validateLName(lname))
		{
		System.out.println("Enter preferred Domain:");
		String pdomain=sc.nextLine();
		if(Service.validatePDomain(pdomain))
		{
		System.out.println("Enter Domain");
		String domain=sc.nextLine();
		if(Service.validatedomain(domain))
		{
		details=new EnquiryInfo(fname,lname,pdomain,domain);
		Service=new EnquiryServiceImpl();
		int res=Service.addEnquiryDetails(details);
		
		System.out.println(res+ " inserted");
		
		if(res==1)
		{
			System.out.println("Value added in database");
		}
		else
		{
			System.out.println("Value not added");
		}

		
	}
	}
}
}
		
	}}
	

	


	