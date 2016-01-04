package com.projekt2501;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        double price;
        int quantity;
        double total;
        Scanner diskReader = new Scanner(new File("."));
        PrintStream diskWriter = new PrintStream("cookBook.txt");

        price = diskReader.nextDouble();
        quantity = diskReader.nextInt();
        total = price * quantity;

        diskWriter.println(total);

        diskReader.close();
        diskWriter.close();
    }
}
