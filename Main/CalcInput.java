package com.company.epam;

import java.util.Scanner;

public class CalcInput {
    public String getUserExpression() {
        System.out.println("Приветсвую,введите ваше выражение!");
        String expression = null;
        Scanner sc = new Scanner(System.in);
        expression = sc.nextLine();

        if(expression.isEmpty()){
            throw new RuntimeException("Извините,вы ввели некорректное выражение");
        }
        return expression;
    }
}
