package com.tutorials.java.oop1;

public class Demo {

	public static void main(String[] args) {
		
		//Creating object of student
		Student student = new Student();
		
		student.studentId = 123;
		student.studentName = "Ritesh";
		student.studentCity = "Pune";
		
		student.study();
		student.showFullDetails();
		System.out.println("--------------------------------------------");
		Student student2 = new Student();
		student2.studentId = 1234;
		student2.studentCity = "Mumbai";
		student2.studentName = "Raj";
		
		student2.showFullDetails();
		System.out.println("--------------------------------------------");
		
		Student student3 = new Student(125,"Ritesh","Pune");
		student3.showFullDetails();
		student3.study(1f);

	}

}
