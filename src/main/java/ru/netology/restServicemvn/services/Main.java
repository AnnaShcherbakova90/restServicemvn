package ru.netology.restServicemvn.services;

public class Main {

    public static void main(String[] args) {

        CalcService restService = new CalcService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int count = restService.calculate(income, expenses, threshold);

        System.out.println("Количество месяцев отдыха" + " " + count);

    }
}
