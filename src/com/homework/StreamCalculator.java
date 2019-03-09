package com.homework;

import java.util.stream.Stream;

public class StreamCalculator {

    static Double calculateAnswer(double firstInput, double secondInput, String operator) {
        Operations result =
                Stream.of(Operations.values())
                        .filter(oper -> oper.getSymbol().equals(operator))
                        .findFirst()
                        .orElseThrow(() -> new IllegalArgumentException("No operation found for operator " + operator));

        return result.getResult(firstInput, secondInput);
    }

}
