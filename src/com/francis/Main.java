package com.francis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String word;
    char[] arr;

    printout("Enter the string to reverse\n");
    Scanner scanner = new Scanner(System.in);
    word = scanner.nextLine();
    arr = word.toCharArray();

    reverseString(arr);


    }


    static void reverseString(char[] arr){
        char[] reversedChars = new char[arr.length];

        for(int i = 0; i < arr.length; i++){
            reversedChars[i] = arr[arr.length - i - 1];
        }

        for(int i = 0; i < reversedChars.length; i++){
            printout(String.valueOf(reversedChars[i]));
        }

    }

    static void printout(String string){
        System.out.print(string);
    }
}
