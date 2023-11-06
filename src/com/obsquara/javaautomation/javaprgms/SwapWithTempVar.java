package com.obsquara.javaautomation.javaprgms;

public class SwapWithTempVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1= 10;
int num2= 20;

System.out.println("Before swapping:");
System.out.println("num1=" +num1);
System.out.println("num2=" +num2);

//swap with the temporary variable

int temp= num1;
num1= num2;
num2= temp;

System.out.println("After swap:");
System.out.println("num1=" +num1);
System.out.println("num2=" +num2);

	}

}
