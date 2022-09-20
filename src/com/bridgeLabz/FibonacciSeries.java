/**
 * 
 */
package com.bridgeLabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,n1 = 0,n2 = 1,n3,i;
	      System.out.println("Enter an number : ");
	      Scanner input = new Scanner(System.in);
	      n = input.nextInt();

	      for(i=2;i<n;++i)
	      {
	    	 n3 =n1+n2;
	    	  System.out.print(" "+n3);
	    	  n1=n2;
	    	  n2=n3;
	    	  
	    	  }
	}

}
