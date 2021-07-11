package com.test.main;

public class FactorialTest {

	public static void main(String[] args) {
		int fact = getFactorial(5);
		System.out.println("factorial of 5 is:"+fact);
		System.out.println("factorial of 5 is:"+fact);
		
	}
	
	public int getFactorial(int num){
		if(num <=1) return 1;
		return num*getFactorial(num-1);
	}
}
