package com.emailapp.model;
/*a)  Generate an email with the following syntax
        firstNamelastName@department.company.com
b)	Determine the department (Technical, Admin, Human Resource, Legal)
c)	Generate a random password which will contain (number, capital letter, small letter & special character)
d)	Display the generated credentials
e)	Use parameterized constructor of class Employee, to pass firstName, lastName.
f)	Create a separate CredentialService which will have generatePassword, generateEmailAddress, & showCredentials method.

 */

public class Employee {
	private String firstName, lastName;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
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
	
	
	

}
