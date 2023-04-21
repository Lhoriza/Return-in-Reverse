package com.bebe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String originalString = "";

        Scanner appScanner = new Scanner(System.in);
        System.out.println("Input a word: ");
        originalString = appScanner.nextLine();

        String reverseString = "";
        for (int i = 0; i < originalString.length(); i++) {
            reverseString = originalString.charAt(i) + reverseString;
        }
        System.out.println(reverseString);
    }
}
