package com.tutorials.java.oop1;

public class Student {

	// Data members
	int studentId;
	String studentName;
	String studentCity;
	
	public Student() {
		System.out.println("Creating Object");
	}
	
	public Student(String student2) {
		System.out.println("Parameterised Constructor");
	}
	
	public Student(int i,String n, String c) {
		studentId = i;
		studentName = n;
		studentCity = c;
	}

	// Behaviour : member methods, functions
	public void study() {
		System.out.println(studentName + " is studying");
	}
	
	public void study(float f) {
		System.out.println("Calling overloaded");
	}

	public void showFullDetails() {
		System.out.println("My Name is " + studentName);
		System.out.println("My ID is " + studentId);
		System.out.println("My City is " + studentCity);
	}

}
