package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void sum1and2in3() {
        int a = 0;
        int b = 2;
        int result = Counter.sum(a, b);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }
}