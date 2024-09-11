package com.example.task02;

import java.util.Scanner;

public class Task02 {
    public static String solution(String input) {
        long value = Long.parseLong(input);

        if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) return "byte";
        else if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) return "short";
        else if (value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE) return "int";
        return "long";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        String result = solution(scanner.nextLine());
        System.out.println("Type of your number: " + result);
    }

}
