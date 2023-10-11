package com.pattern;

public class NumberPrint {

	public static void PrintNumber(int n) {
		for(int i =1 ; i<=n ;i++) {
			for(int j =1 ;j<=i ; j++) {
				if(j==1) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
	PrintNumber(5);
	
}
}
