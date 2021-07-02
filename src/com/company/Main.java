package com.company;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values you want to print: ");
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the next value: ");
            numbers[i] = scanner.nextInt();
        }

        String numbersArray = "[";
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length -1) {
                numbersArray += numbers[i] + ", ";
            } else {
                numbersArray += numbers[i] + "]";
            }
        }

        System.out.println(numbersArray);
    }
}
