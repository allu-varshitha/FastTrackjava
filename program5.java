package com.day1;

public class program5 {
	public static boolean isprime(int n) {
		int div=2;
		while(div<n) {
			if(n%div==0) {
				return false;
			}
			else {
				div=div+1;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=20;
 System.out.println(isprime(n));
 }
	

	
	

}
