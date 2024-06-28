package com.collection;

import java.util.HashMap;

public class DemoHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> countries=new HashMap<Integer,String>();
	
	//put is used to insert key and country	
		countries.put(91, "India");
		countries.put(93,"Afganistan");
		countries.put(92,"Pakistan");
		countries.put(1, "USA");
		countries.put(44, "UK");
		countries.put(5, null);
		countries.put(86, "China");
		
	
		
		System.out.println(countries);
		
		countries.clone();
		
		System.out.println(countries);
		
		
	// replace is uesd to replace country with key
		countries.replace(1,"CAN");
		System.out.println(countries);
	}

}
