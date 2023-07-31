package org.example;

import java.util.Scanner;

/**
 * Exercise: <a href="https://www.youtube.com/watch?v=sjnv8XuBN_E&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=22">...</a>
 * @author Farida Fatali
 */

/* Checking if the number entered by the user is an armstrong number.
* Exc. if he enters 407, it's digit count is 3, we must count it like (4^3) + (0^3) + (7^3) = 64 + 0 + 343 = 407
* If the result equals to the number, it's an armstrong number
*/


public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int n = 0;
        int tempNumber = number;

        do {
            tempNumber = tempNumber / 10;
            n++;
        } while (tempNumber != 0);

        tempNumber = number;
        int digitPow;
        int digitNumber;
        int total = 0;

        while (tempNumber != 0) {
            digitNumber = tempNumber % 10;
            digitPow = 1;

            for (int i = 1; i <= n; i++) {
                digitPow *= digitNumber;
            }

            total += digitPow;
            tempNumber = tempNumber / 10;
        }

        if (total == number) {
            System.out.println(number + " is an armstrong number.");
        } else {
            System.out.println(number + " is not an armstrong number.");
        }

    }
}