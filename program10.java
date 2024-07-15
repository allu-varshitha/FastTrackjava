package com.day1;

public class program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      String str="mom", rev = "";
		    int length = str.length();
		 
		      for ( int i = length - 1; i >= 0; i-- )
		         rev = rev + str.charAt(i);
		 
		      if (str.equals(rev))
		         System.out.println(str+" is a palindrome");
		      else
		         System.out.println(str+" is not a palindrome");
		 
		   
	}

}
