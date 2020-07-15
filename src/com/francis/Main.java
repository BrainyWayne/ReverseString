package com.francis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    printout("Enter the string to reverse\n");
    Scanner scanner = new Scanner(System.in);
    reverseString(scanner.nextLine());

    }


    static void reverseString(String string){

        for(int i = string.length() - 1; i >= 0; i--){
            printout(String.valueOf(string.charAt(i)));
        }


    }

    static void printout(String string){
        System.out.print(string);
    }
}
