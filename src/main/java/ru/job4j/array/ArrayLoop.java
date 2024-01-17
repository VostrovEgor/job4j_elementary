package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] x = new int[5];
        for (int i = 0; i < x.length; i++) {
            x[i] = i * 2 + 3;
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
