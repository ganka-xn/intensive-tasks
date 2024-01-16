package com.walking.intensive.chapter5.task21.utils;

import java.math.BigDecimal;

public class MathUtils {

    private BigDecimal precision = BigDecimal.valueOf(1E-16);

    public boolean lessOrEqual(double a, double b) {
        BigDecimal bigA = BigDecimal.valueOf(a);
        BigDecimal bigB = BigDecimal.valueOf(b);
        BigDecimal difference = bigA.subtract(bigB).abs();

        return (difference.compareTo(precision) <= 0 || bigA.compareTo(bigB) < 0);
    }

    public boolean greaterOrEqual(double a, double b) {
        BigDecimal bigA = BigDecimal.valueOf(a);
        BigDecimal bigB = BigDecimal.valueOf(b);
        BigDecimal difference = bigA.subtract(bigB).abs();

        return (difference.compareTo(precision) <= 0 || bigA.compareTo(bigB) > 0);
    }
}
