/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;


public class Monthconverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");
        int month = input.nextInt();
        String monthString;


        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "This is not a month.";

        }
        System.out.printf("The name of the month is %s", monthString);
    }
}
