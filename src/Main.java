import java.time.LocalDate;

public class Main {
    public static void isLeapYear(int year) {
        if (year > 1584) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год — високосный год");
            } else {
                System.out.println(year + " год — невисокосный год");
            }
        }
        else {
        System.out.println("Год должен быть больше, чем 1584 (в котором был введен високосный год)");
        }
    }
    public static void suggestAppVersion(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите обычную версию приложения по ссылке.");
        }
    }
    public static int deliveringDistance(int deliveryDistance) {
        int dayToDelivery = 0;
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            dayToDelivery = 1;
            return dayToDelivery;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            dayToDelivery = 2;
            return dayToDelivery;
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            dayToDelivery = 3;
            return dayToDelivery;
        } else
            return dayToDelivery;
    }
    public static void main(String[] args) {

        System.out.println("Задание 1.");
        int leepLear = 2000;
        isLeapYear(leepLear);

        System.out.println("Задание 2.");
        int currentYear = LocalDate.now().getYear();
        int currentOS = 1;
        suggestAppVersion(currentOS,currentYear);

        System.out.println("Задание 3.");
        int deliveryDistance = 4;
        System.out.println("Потребуется дней  = " + deliveringDistance(deliveryDistance));

    }
    }
