package com.gl.emailapp.service;

import com.gl.emailapp.model.Employee;

public interface CredentialsService {

	public String passwordGenerator();

	public String emailGenerator(Employee emp, String department);

	public void displayCredentials(Employee emp, String department);

}
