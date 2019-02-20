package task2;

import java.util.Scanner;

public class Exercise_2 {
	public static void main(String[] args) {
		int number, number2;
		
		System.out.println("Enter number: ");
		Scanner scanNumber = new Scanner(System.in);
		number = scanNumber.nextInt();
		System.out.println("Enter number2: ");
		number2 = scanNumber.nextInt();
		scanNumber.close();
		
		System.out.println("Max figure of number = " + maxFigure(number));
		
		System.out.println("Number = " + number + " is " 
		          + ((number == reverseNum(number)) ? " palindrom" : " unpalindrom"));
		
		System.out.println("Number = " + number + " is " + 
                ((isPrimeNumber(number)) ? " prime" : " unprime"));
		
		simpleDividers(number);
		
		System.out.println("GreatestCommonDivisor " + 
		      greatestCommonDivisor(number, number2) + ", leastCommonMultiple " + 
		      leastCommonMultiple(number, number2));

		System.out.println("The number = " + number + " contains " + 
							numberOfDifferentDigits(number) + " different digits.");
		
	}// close main
	
	static int maxFigure(int num){
		int maxFig = 0;
		while (num > 0) {
			if (maxFig < (num % 10)){
				maxFig = num % 10;
			}//close if	
			num /= 10;
		}//close while	
		return maxFig;
	}//close maxFigure
	
	static int reverseNum(int num){
		int revNum = 0;
		while (num > 0) {
			revNum = revNum * 10 + num % 10;
			num /= 10;
		}//close while
		return revNum;
	}//close reverse()
	
	static boolean isPrimeNumber(int num){
		boolean prime = true;
		int n = 2;
		while ((n < num / 2 + 1) && prime) {
			if ((num % n) == 0) {
				prime = false;
			}//close if
			n++;
		}//close while
		return prime;
	}//close isPrimeNumber
	
	static void simpleDividers(int num){
		if (isPrimeNumber(num)) {
			System.out.println("The number = " + num + " is prime");
		} else {
			System.out.println("The number = " + num 
					           + " contains next simple dividers:");
			for (int i = 1; i < num / 2 + 1; i++) {
				if ((num % i == 0) && isPrimeNumber(i)) {
					System.out.println(i);
				}//close if
			}//close for
		}//close if-else
	}//close simpleDividers
	
	static int greatestCommonDivisor(int a, int b){
		return ((b == 0)? a: greatestCommonDivisor(b, a % b));//recursion
	}//close greatestCommonDivisor
	
	static int leastCommonMultiple(int a, int b){
		return (a / greatestCommonDivisor(a, b) * b);
	}//close greatestCommonDivisor
	
	static int numberOfDifferentDigits(int num){
		int count = 0;
		for (int i = 0; i < 10; i++){
			boolean flag = false;
			int numForWhile = num;
			while ((numForWhile > 0) && (!flag)) {
				if ((numForWhile % 10) == i) {
					count++;
					flag = true;
				}//close if
				numForWhile /= 10;
			}//close while
		}//close for
		return count;
	}//close numberOfDifferentDigits
	
}//close class
