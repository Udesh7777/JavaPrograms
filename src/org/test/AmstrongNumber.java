package org.test;

public class AmstrongNumber {
	public static void chechAmstrong(int num){
		int n=num;
		int rem=0,res=0;
		while(num>0)
		{
			rem=num%10;
			res=res+(rem*rem*rem);
			num=num/10;
		}
		if (n==res) {
			System.out.println(n+"is Amstrong");
		}else {
			System.out.println(n+"is not Amstrong");
	
		}
		 
	}
	public static void main(String[] args) {
		chechAmstrong(153);
		chechAmstrong(351);
	}
	

}
