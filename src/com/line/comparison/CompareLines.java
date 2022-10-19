package com.line.comparison;

public class CompareLines extends LineDetails {
    public static void main(String[] args) {
        CompareLines compare = new CompareLines();
        Double l1 = compare.length1;
        System.out.println();
        Double l2 = compare.length2;
        boolean equal = l1.equals(l2);
        System.out.println("Equality of two lines using Java equals method is: "+equal);
        int comp = l1.compareTo(l2);
        System.out.println("Comparing two lines using Java compareTo method is: "+comp);
        if (comp > 0)
            System.out.println("Line-1 is greater than Line-2");
        else if (comp == 0)
            System.out.println("Line-1 is equal to Line-2");
        else
            System.out.println("Line-1 is less than Line-2");
    }
}
