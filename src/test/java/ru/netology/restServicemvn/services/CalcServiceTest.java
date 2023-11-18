package ru.netology.restServicemvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcServiceTest {

    @ParameterizedTest
  /*  @CsvSource({
            "3,10000,20000,3000",
            "2,100000,150000,60000"
    })*/
    @CsvFileSource(files="src/test/resources/rest.csv")
    public void testOne(int expected, int income, int threshold, int expenses) {
        CalcService restService = new CalcService();

        //int income = 10_000;
        //int expenses = 3000;
        //int threshold = 20_000;
        //int expected = 3;
        int actual = restService.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
   /* @Test
    public void testTwo() {
        CalcService restService = new CalcService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int actual = restService.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }*/
}
