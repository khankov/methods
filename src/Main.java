public class Main {
    public static void main(String[] args) {
        isLeapYear(2021);
        returnVersion(1, 2015);
        deliverGoods(95);

    }

    public static void isLeapYear(int year) {
        System.out.println("Задание 1");
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }

    }

    public static void returnVersion(int osType, int currentYear) {
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        if (osType == 0 && clientDeviceYear <= currentYear) {
            System.out.println("Установите приложения для iOS по ссылке");
        } else if (osType == 0 && currentYear < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (osType == 1 && clientDeviceYear <= currentYear) {
            System.out.println("Установите приложения для Android по ссылке");
        } else if (osType == 1 && currentYear < clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void deliverGoods(int deliveryDistance) {
        System.out.println("Задание 3");

        int a = 1;
        if (deliveryDistance > 20) {
            a++;
        }
        if (deliveryDistance > 60) {
            a++;
        }
        if (deliveryDistance > 100) {
            a++;
        }
        System.out.println("Потребуется дней на доставку = " + a);

    }

}