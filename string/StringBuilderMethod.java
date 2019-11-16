package com.string;

public class StringBuilderMethod {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Logesh");
		
		System.out.println(sb.capacity()); // string length + 16 = 22
		
		sb.append("waran");      // insert the data types at the end of string 
		System.out.println(sb);  // Logeshwaran
		
		sb.insert(6," ");        // insert the data types at the specified position
		System.out.println(sb);  // Logesh waran
		
		sb.delete(5,7);
		System.out.println(sb);  // Logeswaran
		
		sb.replace(5,10,"h.");
		System.out.println(sb);  // Logesh.
		
		sb.reverse();
		System.out.println(sb);  // .hsegoL
		
		sb.reverse();
		System.out.println(sb);  // Logesh.
		
		sb.setCharAt(0,'l');
		System.out.println(sb);  // logesh.
			
		sb.append(2110);         // append args meant for all data types
		System.out.println(sb);  // logesh.2110
		
		sb.deleteCharAt(6);
		System.out.println(sb);  // logesh2110
		
		//commit 2
		
	}

}
