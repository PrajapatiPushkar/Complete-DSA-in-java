package loops;

//Count the number of digits for a given number n

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int numOfDigits = 0;

        while (n > 0) {
            n = n / 10;
            numOfDigits++; // numOfDigits = numOfDigits + 1;
        }

        System.out.println("Number of digits in " + n + " = " + numOfDigits);
    }
}
