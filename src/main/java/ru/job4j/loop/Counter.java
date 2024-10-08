package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        if (start <= finish) {
            int sum = 0;
            for (int i = start; i <= finish; i++) {
                sum = sum + i;
            }
            return sum;
        }
        return 0;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(2, 1));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(-100, 100));
        System.out.println(sumByEven(-100, 102));

    }

}