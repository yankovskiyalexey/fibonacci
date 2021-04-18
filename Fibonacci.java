package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {

	private static final int MAX_TERM_VALUE = 10000;

	public void run() {

		
		int c1 = 0;
		int c2 = 1;
		int sum = 0;
		println("This program lists the Fibonacci sequence.");

		while (sum < MAX_TERM_VALUE) {

			println(sum);
			sum = c1 + c2;
			c1 = c2;
			c2 = sum;
			

		}
	}
}
