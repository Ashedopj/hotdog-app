package com.example;

import java.util.Arrays;
import java.util.List;


public class App {
    public static void main(String[] args) {
        HotDog hunter = new HunterDog();
        HotDog master = new MasterDog();
        HotDog berlinka = new Berlinka();

        System.out.println("Отдельные товары:");
        System.out.println(hunter);
        System.out.println(master);
        System.out.println(berlinka);

        List<HotDog> order1 = Arrays.asList(new HunterDog(), new MasterDog());
        List<HotDog> order2 = Arrays.asList(new Berlinka(), new Berlinka(), new HunterDog());

        double sum1 = order1.stream().mapToDouble(HotDog::getPrice).sum();
        double sum2 = order2.stream().mapToDouble(HotDog::getPrice).sum();
        double totalSum = sum1 + sum2;

        System.out.println("\nОбщая сумма всех заказов: " + totalSum);
        System.out.println("Количество полных заказов: 2");
        System.out.println("Средняя стоимость заказа: " + (totalSum / 2));
    }
}