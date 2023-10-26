
//////////////////////////1////////////////////////////

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

/////////////////////////2////////////////////////////////

/*
import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a string: ");
        String str = scanner.nextLine();
		String rev_str="";
		char ch;

		System.out.print("Original word: ");
		System.out.println(str); //Example word

		for (int i=0; i<str.length(); i++)
		{
			ch= str.charAt(i); //extracts each character
			rev_str= ch+rev_str; //adds each character in front of the existing string
		}
	    //rev_str= rev_str + ch;
		System.out.println("Reversed word: "+ rev_str);
	}
}


*/
/////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////


////////////////////////////3//////////////////////////////
/*

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Input a Number: ");
        int number = scanner.nextInt();
        int factorial=1;

        for (int i=1;i<=number;i++){

	        factorial= factorial * i ; // factorial *= i;

        }

        System.out.print("factorial is: "+ factorial);
    }

}


*/
/////////////////////////4////////////////////////
/*
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }
}



*/
//////////////5//////////////////////////

/*

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the count of numbers: ");
        int count = scanner.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}



*/


//////////////6///////////////////
/*


import java.util.Scanner;


public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}


*/