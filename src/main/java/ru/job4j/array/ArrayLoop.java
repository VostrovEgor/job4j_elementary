package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] x = new int[5];
        for (int index = 0; index < x.length; index++) {
            x[index] = index * 2 + 3;
        }
        for (int result : x) {
            System.out.println(result);
        }
    }
}
