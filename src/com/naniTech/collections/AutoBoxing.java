package com.naniTech.collections;

public class AutoBoxing {
	
	
	
	
	
	public static void main (String args[]) {
		//conversion of primitive datatypes to objects is called Autoboxing
		int i = 90;
		Integer it = Integer.valueOf(i);
		double d = 100.00;
		Double db = Double.valueOf(d);
		
		System.out.println(it);
		System.out.println(db);
		
		//conversion of objects to primitive datatypes is called auto unboxing
		
		Integer in = new Integer(100);
		Boolean bl = new Boolean(true);
		int iValue = in.intValue();
		boolean bValue = bl.booleanValue();
		
		System.out.println(iValue);
		System.out.println(bValue);
	}

}
