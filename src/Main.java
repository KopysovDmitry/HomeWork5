public class Main {
    //перенос дз в отдельную ветку//
    public static void main(String[] args) {
        int ios = 0;
        int android = 1;
        int clientIOS = 0;
        if (clientIOS == ios) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //2 TASK//
        int ios1 = 0;
        int android1 = 1;
        int clientIOS1 = 1;
        int clientDeviceYear = 2014;
        if (clientIOS1 == ios1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientIOS1 == android1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для android по ссылке");
        }
        if (clientIOS1 == ios1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientIOS1 == android1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        }
        //3 task//
        int year = 2021;
        if (year % 4 == 0 && year / year % 400 == 0) {
            System.out.println("год является високосным");
        } else {
            System.out.println("год не является високосным");
        }
        //4 task//
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day = 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day = 3;
        }
        {
            System.out.println("Потребуется дней:" + day);
        }
        //5 task 1.1//
        int deliveryDistance1 = 95;
        int day1 = 1;
        if (deliveryDistance1 > 20 && deliveryDistance1 <= 60) {
            System.out.println("Потребуется дней:" + (day1++));
        }
        if (deliveryDistance1 > 60 && deliveryDistance1 <= 100) {
            System.out.println("Потребуется дней:" + (day1 + 2));
        }
        //5 task//
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println("winter");
                break;
            case 2:
                System.out.println("winter");
                break;
            case 3:
                System.out.println("spring");
                break;
            case 4:
                System.out.println("spring");
                break;
            case 5:
                System.out.println("spring");
                break;
            case 6:
                System.out.println("summer");
                break;
            case 7:
                System.out.println("summer");
                break;
            case 8:
                System.out.println("summer");
                break;
            case 9:
                System.out.println("autumn");
                break;
            case 10:
                System.out.println("autumn");
                break;
            case 11:
                System.out.println("autumn");
                break;
            case 12:
                System.out.println("winter");
                break;
        }

    }
}




