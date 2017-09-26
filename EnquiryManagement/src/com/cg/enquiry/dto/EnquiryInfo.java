package com.cg.enquiry.dto;

public class EnquiryInfo {
  private int enquiryId;
  private String firstName;
  private String lastName;
  private String preferredDomain;
  private String domain;
public int getEnquiryId() {
	return enquiryId;
}
public void setEnquiryId(int enquiryId) {
	this.enquiryId = enquiryId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getPreferredDomain() {
	return preferredDomain;
}
public void setPreferredDomain(String preferredDomain) {
	this.preferredDomain = preferredDomain;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}

  
  
public EnquiryInfo(String firstName, String lastName, String preferredDomain,
		String domain) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.preferredDomain = preferredDomain;
	this.domain = domain;
}


public EnquiryInfo(int enquiryId, String firstName, String lastName,
		String preferredDomain, String domain) {
	super();
	this.enquiryId = enquiryId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.preferredDomain = preferredDomain;
	this.domain = domain;
}
public EnquiryInfo()
  {
	  
  }
public void setEnquiryId(String string) {
	// TODO Auto-generated method stub
	
}
  
}
