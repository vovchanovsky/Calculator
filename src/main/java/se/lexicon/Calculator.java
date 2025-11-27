package se.lexicon;

import java.util.List;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class Calculator{


    public static void main(String[] args) {

        IO.println("Welcome to the Calculator!");

        while (true) {
            String equation = enterEquation();
            if (validEquation(equation)) {
                // calculate(equation);
            }
            IO.println("Perform another calculation? (yes/no):");
            Scanner scanner = new Scanner(System.in);
            String askContinue = scanner.nextLine().toLowerCase();
            if (askContinue.equals("no") || askContinue.equals("n")) {
                IO.println("Thank you for using the Calculator. Goodbye!");
                break;
            }
        }
    }


    public static String enterEquation(){
        IO.println("Please enter an equation (e.g., 2 + 2):");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public static boolean validEquation(String equation) {
        for (char c : equation.toCharArray()) {
            if (!isDigit(c) && "+-*/., ".indexOf(c) == -1) {
                IO.println("Error: Invalid character in equation: " + c);
                return false;
            }
        }
        return true;
    }

    public static List<String> tokenize(String equation){
        equation = equation.replaceAll(" ", "").replaceAll(",", ".");
        for (char c : equation.toCharArray()) {

        }

    }





    }
