package org.test;

public class SaperateCases {
	public static void main(String[] args) {
		String  name ="Greens123@gmail.com";
		String upper ="",lower ="",digits ="",special ="";
		int upperCount = 0,lowerCount =0, digitCount =0,SpecialCount =0;
		char [] ch =name.toCharArray();
		for (char c : ch) {
			if (c>=65 && c<=90) {
				
				upperCount++;
				upper=upper+c;
				
			}else if (c>=48 && c<=57) {
				digitCount++;
				digits=digits+c;
				
				
			}else if (c>=97 && c<=122) {
				lowerCount++;
				lower =lower+c;
				
			}else {
				SpecialCount++;
				special=special+c;
			}
			}
			System.out.println("UpperCase"+upper+" count:"+upperCount);
			System.out.println("LowerCase"+lower+" count:"+lowerCount);
			System.out.println("DigitCase"+digits+" count:"+digitCount);
			System.out.println("SpecialCharacter"+special+" count:"+SpecialCount);
		}
	
	
	}


