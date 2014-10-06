/*
 * Problems taken from https://projecteuler.net/
 * 
 * */

/**
 * @author lschlessinger1
 * 
 */
public class Calculator {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.showAnswer(Problem1.getSolution());
		calculator.showAnswer(Problem2.getSolution());
		calculator.showAnswer(Problem3.getSolution());
	}

	private void showAnswer(int answer) {
		System.out.println(Integer.toString(answer));
	}

}
