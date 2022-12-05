package com.gl.emailapp.main;

import java.util.Scanner;

import com.gl.emailapp.model.Employee;
import com.gl.emailapp.service.CredentialsService;
import com.gl.emailapp.service.CredentialsServiceImpl;

public class EmailApp {

	public static void main(String[] args) {
		CredentialsService service = new CredentialsServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the First Name");
		String firstName = sc.next();
		System.out.println("Enter the Last Name");
		String lastName = sc.next();
		Employee employee = new Employee(firstName, lastName);
		String dept = null;
		service.passwordGenerator();
		System.out.println("Please Enter the Department from the following");
		System.out.println("1. Press 1 for Technical");
		System.out.println("2. Press 2 for Admin");
		System.out.println("3. Press 3 for Human Resource");
		System.out.println("4. Press 4 for Legal");
		System.out.println("------------------------------------------------------");

		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			dept = "tech";
			break;
		case 2:
			dept = "admin";
			break;
		case 3:
			dept = "hr";
			break;
		case 4:
			dept = "legal";
			break;

		default:
			System.out.println("Enter the correct choice");
		}
		if (dept != null) {
			service.emailGenerator(employee, dept);
			service.displayCredentials(employee, dept);
		}
	}

}
