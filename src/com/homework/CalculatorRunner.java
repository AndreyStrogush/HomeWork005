package com.homework;

import java.util.Scanner;

public class CalculatorRunner {

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        boolean runAgain;
        do {
            System.out.print("Enter the first number : ");
            Double firstInput = scanner.nextDouble();
            System.out.print("Enter the second number : ");
            Double secondInput = scanner.nextDouble();
            System.out.print("Enter the operator : ");
            String operator = scanner.next();
            Double result = StreamCalculator.calculateAnswer(firstInput, secondInput, operator);
            System.out.println(result);
            System.out.print("Do you want to try again?[Y/N] : ");
            runAgain = scanner.next().toUpperCase().equals("Y");
        } while (runAgain);

        System.out.println("Program finished!");
        scanner.close();
    }

}
