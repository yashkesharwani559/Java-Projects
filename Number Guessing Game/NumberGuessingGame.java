//Number Guessing Game in Java

import java.util.Random;
import java.util.Scanner;


class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int compNum = guessNum(1, 100);

        System.out.println("\n!!!!!!!!!!!NUMBER GUESSING GAME !!!!!!!!!!!\n");

        System.out.println("Starting the game.\n");

        System.out.print("Enter the number from 1 to 100 which you want to guess: ");

        int num = sc.nextInt();

        System.out.println();

        while (true) {

            if (num > 100) {

                System.out.print("Wrong input. Please enter number less than 101: ");

            } else if (num < 1) {

                System.out.print("Wrong input. Please enter number greater than 0: ");

            } else {

                if (num > compNum) {

                    System.out.print("Enter smaller number: ");

                } else if (num < compNum) {

                    System.out.print("Enter greater number: ");

                } else {

                    System.out.print("\n\nYou guessed right number. The number is " + compNum);
                    break;

                }

            }

            num = sc.nextInt();

            System.out.println();

        }

        System.out.println(".\n\nGame ended successfully.\n\n");

    }

    static int guessNum(int min, int max) {

        Random ran = new Random();

        int ranNum = ran.nextInt(max - min + 1) + min;
        
        return ranNum;

    }
}