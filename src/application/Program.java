package application;

import services.PrintService;
import services.PrintServiceString;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Print Int");
        PrintService printService = new PrintService();

        System.out.println("How many values?");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            printService.addValue(value);
        }

        printService.print();
        System.out.println("First: " + printService.first());

        System.out.println();
        System.out.println("Print string");

        PrintServiceString printServiceString = new PrintServiceString();

        System.out.println("How many values?");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String value = scanner.next();
            printServiceString.addValue(value);
        }

        printServiceString.print();
        System.out.println("First: " + printServiceString.first());

        scanner.close();
    }
}
