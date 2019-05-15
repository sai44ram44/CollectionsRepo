package com.naniTech.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls = new LinkedList<String>();
		ls.add("Sairam");
		ls.add("Automation");
		ls.add("Selenium");
		ls.addFirst("Netcracker");
		ls.addLast("TestNG");
		
		Iterator<String> it = ls.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		System.out.println(ls);
		
		ListIterator<String> it2 = ls.listIterator();
		
		while(it2.hasNext()) {
			
			System.out.println(it2.next());
		}
		
		System.out.println(ls);
		
		while(it2.hasPrevious()) {
			
			System.out.println(it2.previous());
		}
		
		

	}

}
