package com.cg.enquiry.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.enquiry.dto.EnquiryInfo;

public interface IEnquiryService {
      public int addEnquiryDetails(EnquiryInfo e) throws IOException, SQLException;

	public ArrayList<EnquiryInfo> retrieveDetails() throws SQLException, IOException;
	public boolean validateFName(String fname);
	public boolean validateLName(String lname);
	public boolean validatePDomain(String pdomain);
	public boolean validatedomain(String domain);
}
