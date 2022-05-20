package com.example.lab_03.model;

public class Param {
    private int from;
    private int to;
    private int step;

    public Param(int from, int to, int step) {
        this.from = from;
        this.to = to;
        this.step = step;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    @Override
    public String toString() {
        return "Param{" +
                "from=" + from +
                ", to=" + to +
                ", step=" + step +
                '}';
    }
}
