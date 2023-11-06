package com.obsquara.javaautomation.controlstatmnts;

public class GradeOfStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalMarks= 45;
		char grade;
		if (totalMarks<0 || totalMarks>100) {
			
			grade= 'I';
		}
		else if (totalMarks <40)
		{
			grade= 'F';//failed
			}
		else if (totalMarks <60) {
			
			grade= 'D';
		}
		else if (totalMarks>70) {
			
			grade= 'C';
			
		}
		else if (totalMarks>80) {
			
			grade = 'B';
		}
		else {
		
			grade= 'A';
		}
			System.out.println("Grade:" +grade);
}
}