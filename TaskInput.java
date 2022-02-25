package com.company.epam;

import java.util.Scanner;

public class TaskInput {

    public String getExpression(){
        System.out.println("Введите ваше выражение");
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        if(expression.isEmpty()){
            throw  new RuntimeException("Введите верное выражение");
        }
        return expression;
    }
}
