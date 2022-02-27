package com.company.epam;

import com.company.epam.task02.TaskValidator;
import com.company.epam.task02.Test;

public class Main {
    public static void main(String[] args) {
        CalcInput input = new CalcInput();
        Test t1 = new Test();
        TaskValidator valid = new TaskValidator();

        String str = input.getUserExpression();
        double result = t1.calculate(str);

        System.out.println("Результат вашего выражения равен "+result);
    }
}

