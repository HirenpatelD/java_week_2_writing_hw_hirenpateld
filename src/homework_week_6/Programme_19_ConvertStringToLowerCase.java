package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

public class Programme_19_ConvertStringToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence : ");
        String uppercase = scanner.nextLine();
        Programme_19_ConvertStringToLowerCase p = new Programme_19_ConvertStringToLowerCase();
        p.convertStringToLowercase(uppercase);
        //Closing the scanner object
        scanner.close();
    }

    //Convert string to the lower case
    public void convertStringToLowercase(String str){
        System.out.println("The lowercase of the string is = " + str.toLowerCase());
    }
}
