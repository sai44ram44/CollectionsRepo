package com.naniTech.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class PrintEvenNumbers {
	
	//Print Even Numbers using Linked List
	
	public static void main (String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(15);
		l.add(17);
		l.add(19);
		l.add(30);
		System.out.println(l);
		Iterator<Integer> it = l.iterator();
		
		while(it.hasNext()) {
			
			Integer i = it.next();
			
			if(i%2 == 0) {
				
				System.out.println(i);
			} else {
				
				it.remove();
			}
			
		}
		
		System.out.println(l);
		
		
		
	}

}
