package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("What is your first integer?");
        int n2 = ap.nextInt("What is your second integer?");
        double average = ((double) n1+ n2)/2;

        System.out.println("The average of your two integers is "+average);
    } }

