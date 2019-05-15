package com.naniTech.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//1. it accept duplicate values
		//2. maintains insertion order
		//3. not synchronized
		//4. it allow random access to fetch the element bcuse it stores the values based on index
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(10);
		
		System.out.println(ar.size());
		
		for(int i=0; i < ar.size(); i++) {
			
			System.out.println(ar.get(i));
		}
		
		//Using Iterator
		
		Employee e1 = new Employee("Sairam", 26, "QA Engineer", 20000.00);
		Employee e2 = new Employee("Vamsi", 24, "Automation Engineer", 24000.00);
		Employee e3 = new Employee("Satish", 30, "Field Engineer", 30000.00);
		
		ArrayList<Employee> ar2 = new ArrayList<Employee>();
		ar2.add(e1);
		ar2.add(e2);
		ar2.add(e3);
		
		//using Iterator to traverse the values
		Iterator<Employee> it = ar2.iterator();
		
		while(it.hasNext()) {
		
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			System.out.println(emp.sal);
		}
		
		

	}
	

}
