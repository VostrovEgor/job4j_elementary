package ru.job4j.condition;

public class AlertDivByZero {
    public static void checkNumber(int number) {
        boolean result = number == 0;
        if (result) {
            System.out.println("Could not div by 0.");
        } else {
            System.out.println("This is negative numbers");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.checkNumber(0);
        checkNumber(-5);
    }
}