package ru.job4j.condition;

public class Max {

    int maximum(int x, int y) {
        return (x > y) ? x : y;
    }

    int maximum(int x, int y, int z) {
        return maximum(maximum(x, y), z);
    }

    int maximum(int x, int y, int z, int w) {
        return maximum(maximum(x, y, z), w);
    }

}