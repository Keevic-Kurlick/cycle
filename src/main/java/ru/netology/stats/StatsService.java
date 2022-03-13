package ru.netology.stats;

public class StatsService {
    public int countTotal(int[] array) {
        int sum = 0;
        for (int amount : array) {
            sum += amount;
        }
        return sum;
    }

    public int countAvg(int[] array) {
        int avg = countTotal(array) / array.length;
        return avg;
    }

    public int findMonthTopSale(int[] array) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : array) {
            if (sale >= array[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public int findMonthBottomSale(int[] array) {
        int minMonth = 0;
        int month = 0;
        for (int sale : array) {
            if (sale <= array[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int calcMonthsLessThanAvg(int[] array) {
        int amount = 0;
        for (int sale : array) {
            if (sale < countAvg(array)) {
                amount++;
            }
        }
        return amount;
    }

    public int calcMonthsMoreThanAvg(int[] array) {
        int amount = 0;
        for (int sale : array) {
            if (sale > countAvg(array)) {
                amount++;
            }
        }
        return amount;
    }
}
