import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int years = ThreadLocalRandom.current().nextInt(4, 2023 + 1);
        identifyYear(years);

        System.out.println("Задача 2");
        int clientOS = ThreadLocalRandom.current().nextInt(0, 3 + 1);
        int clientYear = ThreadLocalRandom.current().nextInt(2007, 2026 + 1);
        selectOS(clientOS, clientYear);

        System.out.println("Задача 3");
        int deliveryDistance = 95;
        if (deliveryTime(deliveryDistance)>0) {
            System.out.println("Доставка потребует " + deliveryTime(deliveryDistance) + " день/дня ");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }


//          task2();
//          task3();
//          task4();
//          task5();
//          task6();
//          task7();
    }

    public static void identifyYear(int year) {
//        year = ThreadLocalRandom.current().nextInt(4, 2023 + 1);
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год  является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void selectOS(int clientOS, int clientYear) {
        int iOS = 0;
        int android = 1;
        int checkYear = LocalDate.now().getYear();
        System.out.println(checkYear);
        if (iOS == clientOS && checkYear <= clientYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (android == clientOS && checkYear <= clientYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (iOS == clientOS && checkYear > clientYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (android == clientOS && checkYear > clientYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Сейчас мы предложим версию под андроид");
        }
    }

    public static int deliveryTime(int deliveryDistance) {
        int deliveryDays;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = -1;
        }
        return deliveryDays;
    }
}
