package com.ExceptionHandling;
import java.util.Scanner;

/*
 * Write a program that collects information of employees in an 
 * organization. When the user gives the input make sure that 
 * employee’s age should be between 18 and 60. If otherwise, throw exception.
 */
public class QuestionNumber1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		try {
			
			System.out.print("Enter user age : ");
			int age=input.nextInt();
			try {
				if(age<18)
					throw new AgeException("Age is less than 18");
				else if(age>60)
					throw new AgeException("Age is more than 60");
				else
					System.out.println("Valid employee age");
			}
			catch(AgeException A) {
				System.out.println(A);
			}
		}
			catch(Exception e) {
			e.printStackTrace();
		}
		
		

}

}

 class AgeException extends Exception{
	
	public AgeException(String str) {
		System.out.println(str);
		
	}
 }
