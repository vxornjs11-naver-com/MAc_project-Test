package com.javalec.function;

import java.util.Scanner;

public class SumAdd {
	
	//F
	
	
	
	//C 
	public SumAdd() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	//M
	public int add() {
		int num1 = 0;
		int num2 = 0;

		System.out.print("정수를 입력 하시오.");
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		System.out.print("정수를 입력 하시오.");
		num2 = scanner.nextInt();
		int result = num1+num2;
		return result;
	}
	

}
