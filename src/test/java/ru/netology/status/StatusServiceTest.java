package ru.netology.status;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


class StatusServiceTest {
    @Test
    void calculateSum() {
        StatusService service = new StatusService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSales() {
        StatusService service = new StatusService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        long actual = service.calculateAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMinSales() {
        StatusService service = new StatusService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        long actual = service.calculateMinSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMaxSales() {
        StatusService service = new StatusService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        long actual = service.calculateMaxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void calculateAboveAverage() {
        StatusService service = new StatusService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        long actual = service.calculateAboveAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateBelowAverage() {
        StatusService service = new StatusService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        long actual = service.calculateBelowAverage(sales);
        assertEquals(expected, actual);
    }
}
