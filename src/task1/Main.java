package task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите радиусы окружностей, где r1 - радиус малой окружности, R2 - радиус большой");
        double r1 = scn.nextDouble();
        double R2 = scn.nextDouble();
        System.out.println("Площадь равна: " + findS(r1, R2));
    }

    public static double findS(double r1, double R2) {
        return (4 * Math.pow(R2, 2) - Math.PI * Math.pow(R2, 2)) / 2 + 0.375 * Math.PI * Math.pow(r1, 2);
    }

}
