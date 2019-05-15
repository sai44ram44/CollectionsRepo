package com.naniTech.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Sairam");
		hm.put(2, "Vamsi");
		hm.put(3, "Chinnu");
		System.out.println(hm);
		for (Entry<Integer,String> m : hm.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		HashMap<Integer,Employee> map = new HashMap<Integer,Employee>();
		
		Employee e1 = new Employee("Sairam", 26, "QA Engineer", 20000.00);
		Employee e2 = new Employee("Vamsi", 24, "Automation Engineer", 24000.00);
		Employee e3 = new Employee("Satish", 30, "Field Engineer", 30000.00);
		
		map.put(1, e1);
		map.put(2, e2);
		map.put(3, e3);
		
		for(Entry<Integer,Employee> em : map.entrySet()) {
			
			System.out.println("Employee Number is: "+em.getKey());
			Employee emp = em.getValue();
			System.out.println(emp.name+" "+emp.age+" "+emp.dept+" "+emp.sal);
			
		}
		
		
		

	}

}
