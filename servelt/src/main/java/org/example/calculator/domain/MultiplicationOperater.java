package org.example.calculator.domain;

public class MultiplicationOperater implements NewArithmeticOperator {
    @Override
    public boolean supports(String operator) {
        return "*".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
        return operand1.toInt() * operand1.toInt();
    }
}
