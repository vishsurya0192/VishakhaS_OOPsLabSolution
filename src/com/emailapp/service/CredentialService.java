package com.emailapp.service;

import java.util.Random;

import com.emailapp.model.Employee;

public class CredentialService {
	//generate password
	
	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random random = new Random();
		char[] password = new char[8];
		
		for (int i = 0; i < 8; i++) {
			//use of charAt() method: for char values
			//use of nextInt() to scan the values as int
			password[i] = values.charAt(random.nextInt(values.length()));
			
		}
		return password;
	}
	
	private String genrateEmailAddress(Employee employee, String department) {
		return employee.getFirstName().toLowerCase()+employee.getLastName().toLowerCase()+"@"+department+".gl.com";
	}
	
	public void showCredentials(Employee employee, String department) {
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows: ");
		System.out.println("email id: " +this.genrateEmailAddress(employee, department));
		System.out.println("password: " +this.generatePassword());
	}

}
