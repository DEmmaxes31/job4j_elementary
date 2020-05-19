package ru.job4j;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int in2 = 140;
        int expected2 = 2;
        int out2 = rubleToDollar(in);
        boolean passed2 = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }

}
