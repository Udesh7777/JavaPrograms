package org.test;

public class Factorial {
	public static void main(String[] args) {
		int num =5, res =1;
		for (int i = 1; i <= num; i++) {
			res=res*i;
			
		}
		System.out.println("factorial no "+res);
	}

}
