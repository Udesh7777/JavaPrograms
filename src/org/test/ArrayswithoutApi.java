package org.test;

public class ArrayswithoutApi {
	public static void main(String[] args) {
		int[] a= {1,9,8,4,7};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;		
				}			
			}		
		}
		System.out.println("After Sorting in Desceding order");
		for (int i : a) {
			System.out.print(i+"\t");	
		}
	}

}
