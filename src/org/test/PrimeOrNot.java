package org.test;

public class PrimeOrNot {
	public static void main(String[] args) {
		int num=30;
		boolean res = true;
		
		if (num==0||num==1) {
			
				System.out.println("0 and 1 not considered as Prime");
				
			}
			else
			{
				for (int i = 2; i < num/2; i++) {
					if (num%i==0) {
						{
						res= false;
						break;
					}
					
				}
					
					
				}	
				if (res== true) {
					System.out.println("prime");
				}else {
					System.out.println("not a prime number");
				}
				
			}
				
				
		}
	}


