package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int three) {
        return max(three, max(left, right));
    }

    public static int max(int left, int right, int three, int four) {
        return max(max(max(left, right), three), four);
    }
}