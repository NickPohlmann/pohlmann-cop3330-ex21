/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Pohlmann
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String numberOfMonthString = myApp.readInput("Please enter the number of the month: ");
        int numberOfMonth = myApp.convertToInt(numberOfMonthString);
        String month = myApp.switchMonth(numberOfMonth);
        String outputString = myApp.generateOutputStatement(month);
        myApp.printOutputString(outputString);
    }

    private void printOutputString(String outputString) {
        System.out.println(outputString);
    }

    private String generateOutputStatement(String month) {
        return "The name of the month is " + month + ".";
    }

    private String switchMonth(int numberOfMonth) {
        String month;
        switch(numberOfMonth) {
            case 1: month = "Januaray";
                break;
            case 2: month = "February";
                break;
            case 3: month = "March";
                break;
            case 4: month = "April";
                break;
            case 5: month = "May";
                break;
            case 6: month = "June";
                break;
            case 7: month = "July";
                break;
            case 8: month = "August";
                break;
            case 9: month = "September";
                break;
            case 10: month = "October";
                break;
            case 11: month = "November";
                break;
            case 12: month = "December";
                break;
            default: month = "Invalid number entered";
        }
        if (month.equals("Invalid number entered")) {
            System.out.print(month);
            System.exit(0);
        }
        return month;
    }

    private int convertToInt(String numString) {
        int num = Integer.parseInt(numString);
        return num;
    }

    private String readInput(String str) {
        System.out.print(str);
        String input = in.nextLine();
        return input;
    }
}