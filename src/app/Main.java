package app;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        int product1Number = 1;
        String product1Name = "smartphone";
        BigDecimal product1TotalSales = new BigDecimal("12153.41");
        int product1Days = 5;

        int product2Number = 2;
        String product2Name = "laptop";
        BigDecimal product2TotalSales = new BigDecimal("10486.85");
        int product2Days = 7;

        BigDecimal product1SalesByDay = product1TotalSales.divide(new BigDecimal(product1Days), 2, RoundingMode.HALF_EVEN);

        switch (product1Name) {
            case "smartphone" -> {
                System.out.printf("Product No %d: %s,%n", product1Number, product1Name);
                System.out.printf("total sales for %d days is EUR %s,%n", product1Days, product1TotalSales);
                System.out.printf("sales by day is EUR %s.%n", product1SalesByDay);
            }
            default -> System.out.println("Unknown product.");
        }


        BigDecimal product2SalesByDay = product2TotalSales.divide(new BigDecimal(product2Days), 2, RoundingMode.HALF_EVEN);

        switch (product2Name) {
            case "laptop" -> {
                System.out.printf("Product No %d: %s,%n", product2Number, product2Name);
                System.out.printf("total sales for %d days is EUR %s,%n", product2Days, product2TotalSales);
                System.out.printf("sales by day is EUR %s.%n", product2SalesByDay);
            }
            default -> System.out.println("Unknown product.");
        }
    }
}