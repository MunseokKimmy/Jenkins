package main.java;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the calculator.");
        Calculator calculator = new Calculator();
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        String input = "";
        while (!input.equals("exit")){
            input = in.nextLine();
            if (input.contains("add")){
                String[] inputs = input.split(" ");
                int answer = calculator.add(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]));
                System.out.println(answer);
            }
            else if(input.contains("subtract")){
                String[] inputs = input.split(" ");
                System.out.println(calculator.subtract(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));

            }
            else if(input.contains("multiply")){
                String[] inputs = input.split(" ");
                System.out.println(calculator.multiply(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));

            }
            else if (input.contains("divide")){
                String[] inputs = input.split(" ");
                System.out.println(calculator.divide(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));

            }
            else if(input.contains("fibonacci")){
                String[] inputs = input.split(" ");
                System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(inputs[1])));

            }
            else if(input.contains("binary")){
                String[] inputs = input.split(" ");
                System.out.println(calculator.intToBinaryNumber(Integer.parseInt(inputs[1])));
            }
        }

    }
}
