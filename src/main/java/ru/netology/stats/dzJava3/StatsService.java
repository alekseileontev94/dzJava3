package ru.netology.stats.dzJava3;

public class StatsService {
    public long amountSales(long[] sales) {
        long amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount += sales[i];
        }
        return amount;
    }

    public long averageSales(long[] sales) {
        long amount = amountSales(sales);
        long average = amount / 12;

        return average;
    }

    public int maxSales(long[] sales) {
        int monthMaxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMaxSales] <= sales[i]) {
                monthMaxSales = i;
            }
        }

        return monthMaxSales + 1;
    }

    public int minSales(long[] sales) {
        int monthMinSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMinSales] >= sales[i]) {
                monthMinSales = i;
            }
        }

        return monthMinSales + 1;
    }

    public int belowAverageSales(long[] sales) {
        long amount = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < amount) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverageSales(long[] sales) {
        long amount = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > amount) {
                count++;
            }
        }
        return count;
    }
}