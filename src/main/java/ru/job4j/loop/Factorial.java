package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int mult = 1;
        for (int i = 1; i <= number; i++) {
            mult = mult * i;
        }
        return mult;
    }
}