package com.florin.tatar.triangle.type;

public class TriangleTypeUtils {
    public static boolean isSidesInputInvalid(double[] sides) {
        return sides == null || sides.length != 3;
    }

    public static boolean hasAnySideNegativeValue(double[] sides) {
        for (double side : sides) {
            if(side < 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean doesThirdSideRuleFail(double[] sides) {
        return sides[0] + sides[1] <= sides[2]
                || sides[0] + sides[2] <= sides[1]
                || sides[1] + sides[2] <= sides[0];
    }

    public static boolean areAllSidesEqual(double[] sides) {
        return sides[0] == sides[1] && sides[0] == sides[2];
    }

    public static boolean areTwoSidesEqual(double[] sides) {
        return sides[0] == sides[1]
                || sides[0] == sides[2]
                || sides[1] == sides[2];
    }
}