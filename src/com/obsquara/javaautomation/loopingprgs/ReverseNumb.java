package com.obsquara.javaautomation.loopingprgs;

public class ReverseNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number= 1234;
		int reverseNumber= 0;
		int temp;
		while (number!=0) {
			temp= number %10;
			reverseNumber= reverseNumber *10+temp;
			number= number/10;
			
		}
		System.out.println("reverseNumber:" +reverseNumber);
	}

}
