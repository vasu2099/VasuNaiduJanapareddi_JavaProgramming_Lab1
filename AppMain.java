package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialsService;
import com.greatlearning_interfaces.ICredentials;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee demoEmployee=new Employee("cathy","teresa") ;
        ICredentials credentialsService=new CredentialsService ();
        
        System.out.println("please choose the department from the following options");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resources");
        System.out.println("4. Legal");
        System.out.println();
        
        Scanner userinput=new Scanner(System.in) ;
        int option=userinput.nextInt();
        
        String generatedEmail = null;
        String generatedPassword = null;
        
        switch(option) {
        case 1 : {
        	generatedEmail=credentialsService.generateEmailAddress(demoEmployee.getFirstName(),demoEmployee.getLaststName(),"tech");
        	generatedPassword=credentialsService.generatepassword();
        	break;
        }
        case 2 : {
        	generatedEmail=credentialsService.generateEmailAddress(demoEmployee.getFirstName(),demoEmployee.getLaststName(),"adm");
        	generatedPassword=credentialsService.generatepassword();
        	break;
        }
        case 3 : {
        	generatedEmail=credentialsService.generateEmailAddress(demoEmployee.getFirstName(),demoEmployee.getLaststName(),"hr");
        	generatedPassword=credentialsService.generatepassword();
        	break;
        }
        case 4 : {
        	generatedEmail=credentialsService.generateEmailAddress(demoEmployee.getFirstName(),demoEmployee.getLaststName(),"lg");
        	generatedPassword=credentialsService.generatepassword();
        	break;
        }
        default:{
        	System.out.println("Enter a valid ooption");
        }
        }
        demoEmployee.setEmail(generatedEmail);
        demoEmployee.setPassword(generatedPassword);
        credentialsService.showCredentials(demoEmployee);
        
        
        }
	}


