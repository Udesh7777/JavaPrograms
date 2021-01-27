package org.test;

public class SortingCharacter {
	public static void main(String[] args) {
		String name="Java Class";
		char[] ch =name.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]>ch[j]) {
					{
					char temp =ch[i];
					ch[i]= ch[j];
					ch[j]=temp;
					
				}
				
			}
			
		}
			}
		System.out.println("After Sorting");
		for (char c : ch) {
			System.out.print(c);
		}
			

	}

}
