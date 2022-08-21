package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        return sum(sales) / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int monthMax = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
            maxMonth = monthMax;
        }
        monthMax = monthMax + 1;
    }
        return maxMonth + 1;
}


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int countBelowAverage(long[] sales) {
        int countMonth = 0;
        long avarageSales = average(sales);
        for (long sale : sales) {
            if (sale > avarageSales) {
                countMonth ++;
            }
        }
        return countMonth;
    }

    public int countАboveAverage(long[] sales) {
        int countMonthAb = 0;
        long avarageSalesAbove = average(sales);
        for (long sale : sales) {
            if (sale < avarageSalesAbove) {
                countMonthAb++;
            }
        }
        return countMonthAb;
    }

}
