package com.obsquara.javaautomation.javaprgms;

public class SwapWithoutTempVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int a= 10;
		int b= 42;
		
		System.out.println("Before swap:");
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		
		
		//swapping a temporary variable using XOR operation
		
		a= a^b;
		b= a^b;
		a= a^b;
		
		System.out.println("\nAfter swapp:");
		System.out.println("a=" +a);
		System.out.println("b=" +b);
	}

}
