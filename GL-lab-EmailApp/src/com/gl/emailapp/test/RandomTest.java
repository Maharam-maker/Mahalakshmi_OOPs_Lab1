package com.gl.emailapp.test;

import java.util.Random;

public class RandomTest {

	public void main(String[] args) {
		String capChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallChars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "@#$%^&*()_+?/<>.-!=";

		String values = capChars + smallChars + numbers + symbols;

		Random random = new Random();
		System.out.println(values.length());
		System.out.println(random.nextInt(values.length()));
		System.out.println(random.nextInt(values.length()));
		System.out.println(random.nextInt(values.length()));

	}

}
