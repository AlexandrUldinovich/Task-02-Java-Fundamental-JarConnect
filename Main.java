package com.company.epam;

import com.company.epam.task02.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskInput input = new TaskInput();
        TaskView view = new TaskView();
        Test t1 = new Test();

        String expression = input.getExpression();
       view.ViewResult(expression);



    }
}

