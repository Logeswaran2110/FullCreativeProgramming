package com.string;

public class StringMethod {

	public static void main(String[] args) {
		String s="Logesh",
				s2="Waran",
				s3="",
				s4="Logesh",
				s5="Logesh";
		
		String s6=new String("Logesh");
		String s7=new String("Logesh");
		
		
		char[] c;
		
		int i,n=50;
		
		// charAt() method
		
		System.out.println(s.charAt(1));
		
		// substring() method
		
		System.out.println(s.substring(2,4));
		System.out.println(s.substring(2));
		
		// isEmpty() method
		
		if(!s2.isEmpty())
			System.out.println("s2 string is not empty");
		
		if(s3.isEmpty())
			System.out.println("s3 string is empty");
		
		// replace() method 

		System.out.println(s2.replace('a','r'));
		System.out.println(s2.replace("ar","yy"));
		
		System.out.println("-------------------------------------------------------------------");
		
		// concat() method
		
		s.concat(s2);
		System.out.println(s);
		
		s=s.concat(s2);
		System.out.println(s);
		
		// toCharArray() method
		
		c=s2.toCharArray();
		
		for(i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		// valueOf() method
		
		String a=String.valueOf(n);
		System.out.println(a+10);
		
		// == operator - it compares reference not value
		
		System.out.println(s4==s5);   
		System.out.println(s5==s6);
		System.out.println(s6==s7);
	}

}
