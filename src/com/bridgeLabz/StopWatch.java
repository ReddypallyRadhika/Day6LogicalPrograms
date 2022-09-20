/**
 * 
 */
package com.bridgeLabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class StopWatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTimer = 0;
		long stopTimer = 0;
		long elapsed;

		Scanner input = new Scanner(System.in);
		// to start timer
		System.out.println("Press '1' to Start Time: ");

		input.nextInt();
		startTimer = System.currentTimeMillis();
		System.out.println("Start Time is: " + startTimer);

		// to stop timer
		System.out.println();
		System.out.println("Press '2' to Stop Time: ");

		input.nextInt();
		stopTimer = System.currentTimeMillis();
		System.out.println("Stop Time is: " + stopTimer);

		long l = elapsed = stopTimer - startTimer;

		System.out.println("");
		System.out.println("Total Time Elapsed(in millisec) is:" + l);
		System.out.println();
		System.out.println("Converting millisec to seconds: " + (l / 1000) + " sec");

	}

}
