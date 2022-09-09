package ru.netology.domen;

public class Smartphone extends Product {
    private String performance;

    public Smartphone(int id, String name, int price, String performance) {
        super(id, name, price);
        this.performance = performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getPerformance() {
        return performance;
    }
}