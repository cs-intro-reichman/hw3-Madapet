// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
		// Tests some of the operations

		/*
		 * System.out.println(plus(2,3)==5); // 2 + 3
		 * System.out.println(minus(7,2)); // 7 - 2
		 * System.out.println(minus(2,7)); // 2 - 7
		 * System.out.println(times(3,-4)); // 3 * 4
		 * System.out.println(plus(2,times(4,2))); // 2 + 4 * 2
		 * System.out.println(pow(5,3)); // 5^3
		 * System.out.println(pow(3,5)); // 3^5
		 * System.out.println(div(12,3)); // 12 / 3
		 * System.out.println(div(5,5)); // 5 / 5
		 * System.out.println(div(25,7)); // 25 / 7
		 * System.out.println(mod(25,7)); // 25 % 7
		 * System.out.println(mod(120,6)); // 120 % 6
		 * System.out.println(sqrt(36));
		 * System.out.println(sqrt(263169));
		 * System.out.println(sqrt(76123));
		 */

		System.out.println(div(6, -3));

	}

	// Returns x1 + x2
	public static int plus(int x1, int x2) {

		while (x2 != 0) {
			if (x2 < 0) {
				x1--;
				x2++;
			} else {
				x1++;
				x2--;
			}
		}
		// System.out.println(x1);
		return x1;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		// Replace the following statement with your code
		while (x2 != 0) {
			if (x2 < 0) {
				x1++;
				x2++;
			} else {
				x1--;
				x2--;
			}

		}
		// System.out.println(x1);
		return x1;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int return_value = 0;
		if (x1 > 0 & x2 > 0 || x1 < 0 & x2 < 0) {
			while (x2 != 0) {
				return_value = x1 > 0 ? plus(return_value, x1) : minus(return_value, x1);
				x2 = x2 > 0 ? minus(x2, 1) : plus(x2, 1);
			}
		} else {
			while (x2 != 0) {
				return_value = x1 > 0 ? minus(return_value, x1) : plus(return_value, x1);
				x2 = x2 > 0 ? minus(x2, 1) : plus(x2, 1);
			}
		}
		// System.out.println(return_value);
		return return_value;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int returned_value = x;
		if (n == 0) {
			returned_value = 1;
		}
		while (n > 1) {
			returned_value = times(returned_value, x);
			n--;
		}
		// Replace the following statement with your code
		return returned_value;
	}

	// Returns the integer part of x1 / x2
	public static int div(int x1, int x2) {
		int counter = 0;
		if (x1 > 0 & x2 > 0 || x1 < 0 & x2 < 0) {
			x1 = x1 < 0 ? times(x1, -1) : x1;
			x2 = x2 < 0 ? times(x2, -1) : x2;
			while (x1 >= x2) {
				// System.out.println("while1");
				x1 = minus(x1, x2);
				counter++;
			}
		} else {
			// System.out.println("while2");
			x1 = x1 < 0 ? times(x1, -1) : x1;
			x2 = x2 < 0 ? times(x2, -1) : x2;
			while (x1 >= x2) {
				x1 = minus(x1, x2);
				counter--;
			}
		}

		// Replace the following statement with your code
		// System.out.println(counter);
		return counter;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		while (x1 >= x2) {
			// System.out.println(x1);
			x1 = minus(x1, x2);
		}
		// Replace the following statement with your code
		return x1;
	}

	// Returns the integer part of sqrt(x)
	public static int sqrt(int x) {
		int return_value = 0;
		long max = x;
		long tmp_max = max;
		long min = 0;
		if (x<=0){return 0;}
		while (return_value == 0) {
			tmp_max = div(max, 2);
			if (pow(tmp_max, 2) > x) {
				max = tmp_max;
			} else {
				min = tmp_max;
				while (return_value == 0) {
					if (pow(min, 2) >= x) {
						return_value = min;
					} else {
						min++;
					}
				}

			}
			// div x by 2, if the pow of the return value is bigger than x, set as an upper
			// value and div again.

		}

		// Replace the following statement with your code
		return return_value;
	}
}