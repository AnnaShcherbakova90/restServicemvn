package ru.netology.restServicemvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcServiceTest {

    @Test
    public void testOne() {
        CalcService restService = new CalcService();

        int income = 10_000;
        int expenses = 3000;
        int threshold = 20_000;
        int expected = 3;
        int actual = restService.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTwo() {
        CalcService restService = new CalcService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int actual = restService.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
