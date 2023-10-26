package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Programme_17_DecimalToBinary {

    public static void main(String[] args) {
        //Scanner declaration from reading input from console
        System.out.println("Welcome to Java programme to convert decimal number to binary numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the decimal number");
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
        //Closing the scanner object
        scanner.close();
    }

    // Converting decimal to binary
    public  static void convertDecimalToBinary(int number){
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is : "  + binary);
    }
}
