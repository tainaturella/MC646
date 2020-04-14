package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static String[] triTypes = { "", // Ignore 0.
            "scalene", "isosceles", "equilateral",
            "not a valid triangle"};
    private static String instructions = "This is the ancient " +
            "TriTyp program.\nEnter three integers that represent the " +
            "lengths of the sides of a triangle.\nThe triangle will be " +
            "categorized as either scalene, isosceles, equilateral\n" +
            "or invalid.\n";
    public static void main (String[] argv)
    {
        TriTyp triTyp = new TriTyp();
        triTyp.retornaTrianguloUsu();
    }

}
