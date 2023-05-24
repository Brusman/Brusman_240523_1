package ru.netology.stats;

public class StatsService {

    public int getSumSales(int[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    public int getAverSales(int[] sales) {
        int averSales = getSumSales(sales) / sales.length;
        return averSales;
    }

    public int getMaxDay(int[] sales) {
        int maxDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxDay]) {
                maxDay = i;
            }
        }
        return maxDay;
    }

    public int getMinDay(int[] sales) {
        int minDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minDay]) {
                minDay = i;
            }
        }
        return minDay;
    }

    public int getDaysLessAverage(int[] sales) {
        int daysLessAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getAverSales(sales)) {
                daysLessAverage = daysLessAverage + 1;
            }
        }
        return daysLessAverage;
    }

    public int getDaysMoreAverage(int[] sales) {
        int daysMoreAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > getAverSales(sales)) {
                daysMoreAverage = daysMoreAverage + 1;
            }
        }
        return daysMoreAverage;
    }
}
