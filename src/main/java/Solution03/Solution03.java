package Solution03;

import java.util.Scanner;

/* Start program
 * ask the user for a quote
 * establish the scanner
 * take input for quote
 * ask user for quote author
 * take input for author
 * print quote and author with quotes using negation character (\)
 */

public class Solution03 {
    public static void main(String[] args) {
        System.out.println("What is the quote?");
        Scanner scnr = new Scanner(System.in);
        String strng01 = scnr.nextLine();
        System.out.println("\nWho said it?");
        String strng02 = scnr.nextLine();
        System.out.println(strng02 + " says, \"" + strng01 + "\"");
    }
}
