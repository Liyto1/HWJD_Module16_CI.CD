package org.example;

public class ArithmeticSequenceCalculator {

    public static int calculateArithmeticProgression(int number) {
       if (number <= 0) {
           throw new IllegalArgumentException("Number must be positive");
        }
       return number * (number + 1) / 2;
    }
}
