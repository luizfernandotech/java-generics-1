package application;

import services.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Print Object");
        PrintService printService = new PrintService();

        System.out.println("How many values?");
        int n = scanner.nextInt();

        printService.addValue("Maria");

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            printService.addValue(value);
        }

        printService.print();
        Integer first = (Integer) printService.first();
        System.out.println("First: " + first);


        scanner.close();
    }
}
