package com.line.comparison;

import java.util.Scanner;

public class Line {
    private double x1,x2,y1,y2;

    //Creating parameterized constructor
    public Line(Scanner scan) {
        System.out.println("Enter both X and Y co-ordinates for the line.");
        System.out.println("User have to give 2 X co-ordinates and 2 Y co-ordinates.");
        this.x1 = scan.nextDouble();;
        this.x2 = scan.nextDouble();;
        this.y1 = scan.nextDouble();;
        this.y2 = scan.nextDouble();;
    }
    //Print co-ordinates
    public void printData()
    {
        System.out.println("X1 = "+x1+"  "+"X2 = "+x2+"  "+"Y1 = "+y1+"  "+"Y2 = "+y2);
    }
    //Method to calculate length.
    public double calculateLength()
    {
        double a = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        double length = (double)Math.sqrt(a);
        return length;
    }
}
