package com.homework;

import java.util.function.DoubleBinaryOperator;

public enum Operations {
    ADD("+", (a, b) -> a + b), // or Double::sum
    SUB("-", (a, b) -> a - b),
    MUL("*", (a, b) -> a * b),
    DIV("/", (a, b) -> a / b),
    ROOT("r", (a, b) -> Math.pow(a, 1 / b)),
    POW("^", Math::pow),
    FUN("f", (a, b) -> Math.pow(((a + b) / (a + 117)), b));

    private final String symbol;
    private final DoubleBinaryOperator operator;

    Operations(String symbol, DoubleBinaryOperator operator) {
        this.symbol = symbol;
        this.operator = operator;
    }

    public double getResult(double d1, double d2) {

        return operator.applyAsDouble(d1, d2);
    }

    public String getSymbol() {

        return symbol;
    }

}
