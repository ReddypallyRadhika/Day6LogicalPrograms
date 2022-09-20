/**
 * 
 */
package com.bridgeLabz;

import java.util.Scanner;

//import com.bridgelabz.StaticExample;

/**
 * @author hp
 *
 */
public class CouponNumbers {

	/**
	 * @param args
	 */
	
/*	public static int distinctCoupon(int N) 
	{
		return (int) (Math.floor(Math.random()*10)%N);
		
	}
	public static int collectCoupon(int N)
	{
		boolean[] collected = new boolean[N];
		int distinct = 0;
	    int count = 0;

	      while( distinct<N)
	      {
	    	  int value = distinctCoupon(N);
	    	  count++;
	    	  if(!collected[value])
	    	  {
	    		  distinct++;
	    		  collected[value] = true;
	    	  }
	      }
	return count;
	}*/
	 /*     public static void main(String[] args) 
	   // TODO Auto-generated method stub
	      {
	    	  //int N = Integer.parseInt(args[0]);
	    	// int count = collectCoupon(N);
	    	//System.out.println(count);
	    	
	    	System.out.println("Enter N : ");
		      Scanner sc = new Scanner(System.in);
		     int  N = sc.nextInt();
		     for (int i = 0;i<N;i++)
		     {
		     int Coupon = (int) (Math.floor(Math.random()*10)%N);
		    // return (int) (Math.floor(Math.random()*10)%N);
		     System.out.println(Coupon);
		     }
		     */
		     
		    public static void main(String[] args)
		     {
		    	
		 	char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		 	int  N = 10000000;
		//	int Coupon = (int) (Math.floor(Math.random()*10)%N);
			int Coupon=(int) (Math.random()*N);	
			//// Creating an object of StringBuffer class
			StringBuffer sb=new StringBuffer();//StringBuffer(): creates an empty string buffer with the initial capacity of 16.
			
			while (Coupon>0)
			{
				sb.append(chars[Coupon % chars.length]);//The append() method concatenates the given argument with this string.
				Coupon /= chars.length;
			}

			String couponCode=sb.toString();//This method converts the value of a current instance into a String
			System.out.println("Coupon Code: "+couponCode);	
	}

}
