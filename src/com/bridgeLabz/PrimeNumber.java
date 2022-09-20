/**
 * 
 */
package com.bridgeLabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,count=0;
		   System.out.println("Enter an number : ");
		      Scanner input = new Scanner(System.in);
		      n = input.nextInt();

		      for(i=2;i<n;i++)
		      {
		    	  if(n%i==0)
		    	  {
		    		count++;
		    	  }
		      }
		    if(count==0)
		      {
		    	  System.out.println("Given  number is pime number");
		      }
		    	  else
		    	  {
		    		  System.out.println("Given number is not a prime number");
		    	  }
		      
	}

}
