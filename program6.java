package com.day1;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      String str="bank", rev = "";
	    int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	      System.out.println(rev);
	}

}
