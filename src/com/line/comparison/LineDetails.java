package com.line.comparison;

import java.util.Scanner;

public class LineDetails {
    Scanner scan = new Scanner(System.in);
    String s1 = "Line1";
    String s2 = "Line2";
    double length1 = getLine(scan,s1);
    double length2 = getLine(scan,s2);

    public static double getLine(Scanner scan, String s) {
        System.out.println("Enter co-ordinate values for "+s);
        Line l = new Line(scan);
        l.printData();
        System.out.println();
        System.out.println("Length for "+s+" is : "+l.calculateLength());
        return l.calculateLength();
    }
}
