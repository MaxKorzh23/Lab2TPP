package hello;

import org.mariuszgromada.math.mxparser.Expression;

public class Calculator {
    public double calculate(String expression) {
        Expression exp = new Expression(expression);
        if (!exp.checkSyntax()) {
            throw new IllegalArgumentException("Неправильний формат виразу");
        }
        return exp.calculate();
    }
}
