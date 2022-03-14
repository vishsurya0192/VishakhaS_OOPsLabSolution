package com.emailapp.main;

import java.util.Scanner;

import com.emailapp.model.Employee;
import com.emailapp.service.CredentialService;

public class DriverClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("First Name: ");
		String firstName = scanner.nextLine();
		System.out.println("Last Name: ");
		String lastName = scanner.nextLine();
		
		Employee employee = new Employee(firstName, lastName);
		CredentialService cs = new CredentialService();
		
		System.out.println("Please enter the department from the following-------------");
		System.out.println("1. Technical \n2. Admin \n3.Human Resource \n4.Legal");
		int option = scanner.nextInt();
		
		switch(option) {
		case 1:
			cs.showCredentials(employee, "tech");
			break;
		case 2:
			cs.showCredentials(employee, "admin");
			break;
		case 3:
			cs.showCredentials(employee, "humanresource");
			break;
		case 4:
			cs.showCredentials(employee, "legal");
			break;
			
		default:
			System.out.println("Invalid option. Please enter a valid option");
			break;
		}

	}

}
