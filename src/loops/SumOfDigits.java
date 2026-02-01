package loops;

//Find the sum of digits in a given number n

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: " );
        int n = sc.nextInt();
        int sumOfDigits = 0;
        int originalNum = n;

        while (n > 0) {
            sumOfDigits += n % 10;
            n = n / 10;
        }

        System.out.println("sum of digits  in " + originalNum + " = " + sumOfDigits);
    }
}
