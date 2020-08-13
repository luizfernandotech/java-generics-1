package application;

import services.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PrintService<Integer> printServiceInteger = new PrintService<>();

        System.out.println("How many values?");
        int n = scanner.nextInt();

        System.out.println("Print Generics <Integer>");
        System.out.println("Type integers");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            printServiceInteger.addValue(value);
        }

        printServiceInteger.print();
        System.out.println("First: " + printServiceInteger.first());

        System.out.println();

        System.out.println("Print Generics <String>");
        PrintService<String> printServiceString = new PrintService<>();

        System.out.println("Type strings");
        for (int i = 0; i < n; i++) {
            String value = scanner.next();
            printServiceString.addValue(value);
        }

        printServiceString.print();
        System.out.println("First: " + printServiceString.first());

        scanner.close();
    }
}
