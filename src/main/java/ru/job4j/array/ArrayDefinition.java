package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[100500];
        names[0] = "Egor";
        names[1] = "Nastasia";
        names[2] = "Mark";
        names[3] = "-";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
