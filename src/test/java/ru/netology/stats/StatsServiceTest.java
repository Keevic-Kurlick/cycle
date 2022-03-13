package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    @Test
    void shouldCalculateTotal() {
        int[] sales = {8, 4, 2, 6, 5};
        StatsService service = new StatsService();
        int actual = service.countTotal(sales);
        int expected = 25;
        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateAvg() {
        int[] sales = {8, 4, 2, 6, 5};
        StatsService service = new StatsService();
        int actual = service.countAvg(sales);
        int expected = 5;
        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateMax() {
        int[] sales = {8, 4, 2, 6, 5};
        StatsService service = new StatsService();
        int actual = service.findMonthTopSale(sales);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateMin() {
        int[] sales = {8, 4, 2, 6, 5};
        StatsService service = new StatsService();
        int actual = service.findMonthBottomSale(sales);
        int expected = 3;
        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateLessThanAvg() {
        int[] sales = {8, 4, 2, 6, 5};
        StatsService service = new StatsService();
        int actual = service.calcMonthsLessThanAvg(sales);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateMoreThanAvg() {
        int[] sales = {8, 4, 2, 6, 5};
        StatsService service = new StatsService();
        int actual = service.calcMonthsMoreThanAvg(sales);
        int expected = 2;
        assertEquals(actual, expected);
    }
}