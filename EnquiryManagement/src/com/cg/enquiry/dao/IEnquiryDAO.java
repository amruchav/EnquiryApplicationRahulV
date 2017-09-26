package com.cg.enquiry.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.enquiry.dto.EnquiryInfo;

public interface IEnquiryDAO {

	int addEnquiryDetails(EnquiryInfo e) throws IOException, SQLException;


	ArrayList<EnquiryInfo> retrieveDetails(int a) throws SQLException, IOException;

}
