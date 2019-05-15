package com.naniTech.collections;

public class Employee {
	
	String name;
	int age;
	String dept;
	double sal;
	
	Employee(String name, int age, String dept, double sal) {
		
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.sal = sal;
	}
	
	void display() {
		
		System.out.println("Name of the employee is"+name);
		System.out.println("Age of the employee is"+age);
		System.out.println("Dept of the employee is"+dept);
		System.out.println("Sal of the employee is"+sal);
		
	}

}
