package com.example.lab_03.model;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private double calculate(double a, double b, double c, double d) {
        return Math.pow(Math.tan(a), 1 / c) /
                (1 + (Math.exp(b) - Math.exp(-b)) / (2 * Math.log(Math.abs(c + d))));
    }

    public List<Answer> calculateTask(List<Param> params) {
        List<Answer> answers = new ArrayList<>();
        Param a = params.get(0);
        Param b = params.get(1);
        Param c = params.get(2);
        Param d = params.get(3);
        for (double i = a.getFrom(); i <= a.getTo(); i = i + a.getStep()) {
            for (double j = b.getFrom(); j <= b.getTo(); j = j + b.getStep()) {
                for (double k = c.getFrom(); k <= c.getTo(); k = k + c.getStep()) {
                    for (double m = d.getFrom(); m <= d.getTo(); m = m + d.getStep()) {
                        double result = calculate(i, j, k, m);
                        answers.add(new Answer(i, j, k, m, result));
                    }
                }
            }
        }
        return answers;
    }
}