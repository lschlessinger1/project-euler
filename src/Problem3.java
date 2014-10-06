/**
 * Largest prime factor
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

/**
 * @author lschlessinger1
 * 
 */
public class Problem3 {

	private static long number = 600851475143L;

	public static int getSolution() {
		long lpf = number;
		int n = 2;
		for (int i = n; i < lpf; i++) {
			if (lpf % n == 0) {
				lpf = lpf / n;
			} else {
				n++;
			}
		}
		return (int)lpf;
	}

}
