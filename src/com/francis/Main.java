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

        for(int i = arr.length - 1; i >= 0; i--){
            printout(String.valueOf(arr[i]));
        }


    }

    static void printout(String string){
        System.out.print(string);
    }
}
