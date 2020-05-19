package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double rslH =  p / (2 * (k + 1));
        double rslL = rslH * k;
        double rslS = rslL * rslH;

        return rslS;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
