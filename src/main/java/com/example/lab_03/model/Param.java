package com.example.lab_03.model;

public class Param {
    private double from;
    private double to;
    private double step;

    public Param(double from, double to, double step) {
        this.from = from;
        this.to = to;
        this.step = step;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getStep() {
        return step;
    }

    public void setStep(double step) {
        this.step = step;
    }
}
