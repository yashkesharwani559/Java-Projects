//task is to create a calculator using java that performs basic operations as :- addition, subtraction, multiplication, division using switch statement

import java.util.Scanner;

class A{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float num1, num2;

        System.out.print("Enter the first number: ");
        num1 = sc.nextFloat();
        
        System.out.print("Enter the first number: ");
        num2 = sc.nextFloat();

        System.out.println("1 - Addition");
        System.out.println("2 - Addition");
        System.out.println("3 - Multiplication");
        System.out.println("3 - Division");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result = " + (num1 * num2));
                break;
            case 4:
                System.out.println("Result = " + (num1 / num2));
                break;
            default:
                System.out.println("Wrong Input");
        }
        
        System.out.println("Program completed");
    }
}