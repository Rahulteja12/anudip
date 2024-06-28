package com.collection;

import java.util.HashSet;

public class DemoHashSet {

	public static void main(String[] args) {
		
		HashSet<String> names=new HashSet<String>();
	
		
		names.add("java");
		names.add("c");
		names.add("Pyton");
		names.add("aws");
		
	//the below for loop is used to print the added elements in hashset	
		for(String s:names)
			System.out.println(s+" and");
		
		names.add("ram");
		names.add(null);
		names.add(null);
		System.out.println(names);
		names.remove("java");
		System.out.println(names);
	}

}
