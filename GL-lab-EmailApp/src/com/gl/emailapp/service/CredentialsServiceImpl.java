package com.gl.emailapp.service;

import java.util.Random;

import com.gl.emailapp.model.Employee;

public class CredentialsServiceImpl implements CredentialsService {

	@Override
	public String passwordGenerator() {
		// TODO PasswordGenerator Using RandomMethods.
		String capChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallChars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "@#$%^&*()_+?/<>.-!=";

		String values = capChars + smallChars + numbers + symbols;

		Random random = new Random();

		char[] password = new char[8];
		for (int i = 0; i < 8; i++) {
			int randomNumber = random.nextInt(values.length());
			password[i] = values.charAt(randomNumber);
		}

		return new String(password);
	}

	@Override
	public String emailGenerator(Employee emp, String department) {

		return (emp.getFirstName() + emp.getLastName()).toLowerCase() + "@" + department + ".opt.com";

	}

	@Override
	public void displayCredentials(Employee emp, String department) {
		// TODO Auto-generated method stub
		System.out.println(
				" Dear " + emp.getFirstName() + " " + emp.getLastName() + " your generated credentials as follows:");
		System.out.println("Email: --> " + emailGenerator(emp, department));
		System.out.println("Password -->+" + passwordGenerator());
	}

}
