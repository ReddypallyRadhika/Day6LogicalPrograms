/**
 * 
 */
package com.bridgeLabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class PerfectNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum=0;
		   System.out.println("Enter an number : ");
		      Scanner input = new Scanner(System.in);
		      n = input.nextInt();

		      for(i=1;i<n;i++)
		      {
		    	  if(n%i==0)
		    	  {
		    		  sum=sum+i;
		    	  }
		      }
		    	  if(sum==n)
		    	  {
		    		  System.out.println("Given  number is perfect number");
		    	  }
		    	  else
		    	  {
		    		  System.out.println("Given number is not a perfect number");
		    	  }
		      
	}

}
