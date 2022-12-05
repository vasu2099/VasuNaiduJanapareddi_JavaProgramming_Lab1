package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;
import com.greatlearning_interfaces.ICredentials;

public class CredentialsService implements ICredentials{
public String generateEmailAddress(String firstName, String lastName,String department) {
	String emailAddress= firstName+lastName+"@"+department+".gl.com ";
	return emailAddress;
	
}
	
	public String generatepassword() {
		String capitalLetters="ABCDEFGHIJKLAMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialcharacters="!@#$%*?";
		String allvalues=capitalLetters+smallLetters+numbers+specialcharacters;
		Random randomobj=new Random();
		String password="";
		
		for(int i=0;i<8;i++) {
			int boundvalue=allvalues.length();
			int randomIndex= randomobj.nextInt(boundvalue);
			char randomChar=allvalues.charAt(randomIndex);
			password+=String.valueOf(randomChar);
		}
		return password;
		
	}
	
	public void showCredentials(Employee employee) {
		System.out.println("Dear"+employee.getFirstName()+"your generated credentials are :");
		System.out.println("Email ID:"+employee.getEmail());
		System.out.println("password :"+employee.getPassword());
	}
	

}