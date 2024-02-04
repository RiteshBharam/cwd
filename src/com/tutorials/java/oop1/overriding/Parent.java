package com.tutorials.java.oop1.overriding;

public class Parent {
	
	//Overridden Method
	public void m1() {
		System.out.println("I am method m1() of parent");
	}
}

class Child extends Parent{
	
	//Overriding Method
	public void m1() {
		System.out.println("I am m1 of Child");
	}
}
