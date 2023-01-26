import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void printYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task1() {
        int year = 2024;
        printYear(year);
    }

    public static void printInfoAboutPhone(int versionOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (versionOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (versionOS == 1) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2023;
        printInfoAboutPhone(clientOS, clientDeviceYear);
    }

    public static int printDaysOfDelivery(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime += 1;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime += 2;
        }
        return deliveryTime;
    }

    public static void task3() {
        int deliveryDistance = 95;
        if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется");
        } else {
            int daysOfDelivery = printDaysOfDelivery(deliveryDistance);
            System.out.println("Для доставки потребуется " + daysOfDelivery + " дней");
        }
    }
}