package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2 ;
        double rsl1 = p*((p-a)*(p-b)*(p-c));
        double rsl = Math.sqrt(rsl1);;
        double rsl2 = rsl;
        return rsl2;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
