package ru.netology.stats;

public class Main {
    public static int[] statArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public static void main(String[] args) {
        StatsService service = new StatsService();
        System.out.println("Общее число продаж: " + service.countTotal(statArray));
        System.out.println("Среднее число продаж: " + service.countAvg(statArray));
        System.out.println("Месяц максимальных продаж: " + service.findMonthTopSale(statArray));
        System.out.println("Месяц минимальных продаж: " + service.findMonthBottomSale(statArray));
        System.out.println("Количество месяцев с продажами меньше среднего: " + service.calcMonthsLessThanAvg(statArray));
        System.out.println("Количество месяцев с продажами больше среднего: " + service.calcMonthsMoreThanAvg(statArray));
    }
}
