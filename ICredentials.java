package com.greatlearning_interfaces;

import com.greatlearning.model.Employee;

public interface ICredentials {
	public String generateEmailAddress(String firstName, String lastName,String department);
	
	public String generatepassword();
	
	public void showCredentials(Employee employee);


	
}