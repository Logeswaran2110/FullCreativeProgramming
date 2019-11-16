package com.string;

public class StringBufferMethod {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Logesh");
		
		sb.append("waran");
		System.out.println(sb);  // Logeshwaran
		
		sb.insert(6," ");
		System.out.println(sb);  // Logesh waran
		
		sb.delete(5,7);
		System.out.println(sb);  // Logeswaran
		
		sb.replace(5,10,"h.");
		System.out.println(sb);  // Logesh.
		
		sb.reverse();
		System.out.println(sb);  // .hsegoL
		
		sb.reverse();
		System.out.println(sb);  // Logesh.
		
	}

}
