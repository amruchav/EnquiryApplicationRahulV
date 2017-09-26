package com.cg.enquiry.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.enquiry.dbutil.DbUtil;
import com.cg.enquiry.dto.EnquiryInfo;
import com.cg.enquiry.service.EnquiryServiceImpl;
import com.cg.enquiry.service.IEnquiryService;


public class EnquiryDAOImpl implements IEnquiryDAO{
		Connection conn=null;
@Override
public int addEnquiryDetails(EnquiryInfo e) throws IOException, SQLException {
	int result=0;
		conn=DbUtil.getConnection();
		String insertQuery="Insert into enquiry values(enquiry_seq_id.nextval,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(insertQuery);
		ps.setString(1,e.getFirstName());
		ps.setString(2,e.getLastName());
		ps.setString(3,e.getPreferredDomain());
		ps.setString(4, e.getDomain());
		result=ps.executeUpdate();
		System.out.println(result);
		return result;
	}

public ArrayList<EnquiryInfo> retrieveDetails(int a) throws SQLException, IOException {
	IEnquiryService g=new EnquiryServiceImpl();
	ArrayList<EnquiryInfo> list=new ArrayList<EnquiryInfo>();
	
	conn=DbUtil.getConnection();
	
	
	String sl="Select * from enquiry where enquiryid=?";
	
	
	PreparedStatement stmt=conn.prepareStatement(sl);
	stmt.setInt(1,a);
	ResultSet rs=stmt.executeQuery();
	
	EnquiryInfo d=new EnquiryInfo();
	
	while(rs.next())
	{
		int id = rs.getInt(1);
		String fname=rs.getString(2);
		String lname=rs.getString(3);
		String pdomain=rs.getString(4);
		String domain=rs.getString(5);
		
		list.add(new EnquiryInfo(id, fname,lname,pdomain,domain));
	}
	return list;
	


}

}






