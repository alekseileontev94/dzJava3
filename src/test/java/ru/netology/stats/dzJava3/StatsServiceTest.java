package ru.netology.stats.dzJava3;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void shouldCountAmountSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actuall = service.amountSales(sales);

        Assertions.assertEquals(expected, actuall);
    }

    @Test
    public void shouldCountAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actuall = service.averageSales(sales);

        Assertions.assertEquals(expected, actuall);
    }

    @Test
    public void shouldCountMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actuall = service.maxSales(sales);

        Assertions.assertEquals(expected, actuall);
    }

    @Test
    public void shouldCountMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actuall = service.minSales(sales);

        Assertions.assertEquals(expected, actuall);
    }

    @Test
    public void shouldCountBelowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actuall = service.belowAverageSales(sales);

        Assertions.assertEquals(expected, actuall);
    }

    @Test
    public void shouldCountAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actuall = service.aboveAverageSales(sales);

        Assertions.assertEquals(expected, actuall);
    }
}
