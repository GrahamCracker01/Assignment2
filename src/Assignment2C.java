//Class: CSE 1321L
//Section: J02
///Term: Fall 2022
//Instructor: Aarthi Poovalingam
//Name: Asher Graham
//Lab#: ...

import java.util.Scanner;
class Assignment2C {
    public static void main(String[] args){

        //declare scanner, variables, and constants
        Scanner scan = new Scanner(System.in);
        int intUS;
        double dblPound;
        double dblBison;
        final double dblUSToPound = 0.85;
        final double dblPoundToBison = 0.2;

        //input
        System.out.println("[Bisonica Currency Exchange]");
        System.out.println("General Bison welcomes you to Pax Bisonica!");
        System.out.println("");
        System.out.print("How many US Dollars do you have? ");
        intUS = scan.nextInt();

        //math
        dblPound = (double) intUS * dblUSToPound;
        dblBison = dblPound * dblPoundToBison;

        //output
        System.out.println("");
        System.out.println(intUS + " US Dollar(s) is " + String.format("%.2f", dblPound) + " British Pound(s),\n" + "which is worth " + dblBison + " Bison Dollar(s)!");


    }
}