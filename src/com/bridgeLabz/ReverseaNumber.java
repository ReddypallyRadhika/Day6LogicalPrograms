/**
 * 
 */
package com.bridgeLabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class ReverseaNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number N :");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
	    
	   System.out.println("Original Number: " + N);

	    // run loop until N becomes 0
	    for(int  i = 0;N != 0 ; N /= 10) {
	    
	      // get last digit from N
	      int rem = N % 10;
	      i = i * 10 + rem;
	      System.out.println("Reversed Number: " +i);
	    }

	}

}
