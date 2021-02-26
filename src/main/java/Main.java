package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main() throws IOException {
        System.out.println("Welcome to the calculator.");
        Calculator calculator = new Calculator();
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        String input = "";
        while (!input.equals("exit")){
            input = in.nextLine();
            if (input.contains("add")){
                String[] inputs = input.split(" ");
                System.out.println(calculator.add(Integer.getInteger(inputs[1]), Integer.getInteger(inputs[2])));
            }
            else if(input.contains("subtract")){
                String[] inputs = input.split(" ");
                System.out.println(calculator.subtract(Integer.getInteger(inputs[1]), Integer.getInteger(inputs[2])));

            }
            else if(input.contains("multiply")){
                String[] inputs = input.split(" ");
                System.out.println(calculator.multiply(Integer.getInteger(inputs[1]), Integer.getInteger(inputs[2])));

            }
            else if (input.contains("divide")){
                String[] inputs = input.split(" ");
                System.out.println(calculator.divide(Integer.getInteger(inputs[1]), Integer.getInteger(inputs[2])));

            }
            else if(input.contains("fibonacci")){
                String[] inputs = input.split(" ");
                System.out.println(calculator.fibonacciNumberFinder(Integer.getInteger(inputs[1])));

            }
            else if(input.contains("binary")){
                String[] inputs = input.split(" ");
                System.out.println(calculator.intToBinaryNumber(Integer.getInteger(inputs[1])));
            }
        }

    }
}
