package com.greatlearning.model;

public class Employee {
	private String firstName;
	private String  laststName;
	private String email;
	private String password;
	private String department;
	
	 public Employee(String firstName,String lastName) {
		 this.firstName=firstName;
		 this.laststName=lastName;
	 }

	public String getFirstName() {
		return firstName;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLaststName() {
		return laststName;
	}

	private void setLaststName(String laststName) {
		this.laststName = laststName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	  
	 
	 
	 
	 
	 
	 
	 
}
