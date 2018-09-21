package com.privalia.principal;

import com.privalia.business.Calculator;
import com.privalia.business.ICalculator;

public class Main {
    public static void main(String[] args) {
        ICalculator calculator = new Calculator();
        StringBuilder stringBuilder = new StringBuilder("La respuesta a todas las preguntas del universo y todo lo demás es ");
        System.out.println(stringBuilder.append(calculator.sum(40, 2)));
    }
}
