package com.obsquara.javaautomation.loopingprgs;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		
		int f=1, s=1, t;
		System.out.println(f);
		System.out.println(s);
		
	
	for (int i=3; i<n; i++)
	{
		t= f+s;
	
	System.out.println(t);
	f=s;
	s=t;
	}
	}
	}


