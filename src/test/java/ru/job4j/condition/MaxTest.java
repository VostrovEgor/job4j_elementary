package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2To3Then3() {
        int left = 1;
        int right = 2;
        int three = 3;
        int result = Max.max(left, right, three);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}