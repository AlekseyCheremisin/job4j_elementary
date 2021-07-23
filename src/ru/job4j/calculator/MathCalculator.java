package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffAndDivision(double first, double second) {
        return diff(first, second)
                + div(first, second);
    }

    public static double sumAndDiffAndMultiplyAndDiv(double first, double second) {
        return sumAndMultiply(first, second) + diffAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета (10 + 20) + 10 * 20 = " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета (10 - 20) + 10 / 20 = " + diffAndDivision(10, 20));
        System.out.println("Результат расчета (10 + 20) + 10 * 20 + (10 - 20) + 10 / 20 = " +
                sumAndDiffAndMultiplyAndDiv(10, 20));
    }
}
