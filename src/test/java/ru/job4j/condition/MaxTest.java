package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void when1And20Then20() {
        Max max = new Max();
        int x = 1;
        int y = 20;
        int expected = 20;
        int output = max.maximum(x, y);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when10And2And3Then10() {
        Max max = new Max();
        int x = 10;
        int y = 2;
        int z = 3;
        int expected = 10;
        int output = max.maximum(x, y, z);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when1And2And3And0Then3() {
        Max max = new Max();
        int x = 1;
        int y = 2;
        int z = 3;
        int w = 0;
        int expected = 3;
        int output = max.maximum(x, y, z, w);
        assertThat(output).isEqualTo(expected);
    }

}