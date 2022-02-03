package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
// Task 1
        int year = 2022;
        int leapYear = checkLeapYear(year);

// Task 2
        String clientOs = getClientOS();
        System.out.println(clientOs);

// Task 2.1
        int clOs = 0;
        int phYr = 2020;
        String clientOs2 = getClientOS2(clOs, phYr);
        System.out.println(clientOs2);
// Task 3
        int deliveryDistance = 95;
        int days = getDistance(deliveryDistance);
        System.out.println("Потребуется дней: " + days);

// Task 4
        String param = "aabccddefgghiijjkk";
        checkDouble(param);

// Task 5
        int[] mass1 = new int[]{3, 2, 1, 6, 5};
        reverseMass(mass1);
        System.out.print(Arrays.toString(mass1));

    }

    // Task 1
    public static int checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - является високосным");
            return year;
        } else {
            System.out.println(year + " год - не является високосным");
        }
        return year;
    }


    // Task 2 Подправил. Сделал всё в 1 методе
    public static String getClientOS() {
        String osName = "Android";
        String yearVersion = "Вам нужно установить обычную версию";
        int phoneYear = 2020;
        int currentYear = LocalDate.now().getYear();
        if (osName.equals("iOS")) {
            osName = "iOS";
        }
        if (phoneYear < currentYear) {
            yearVersion = "Вам нужно установить lite-версию";
        }
        String clientOs = yearVersion + " для " + osName;
        return clientOs;
    }
    // Task 2.1 Сделал 2 числовых значения на вход
    public static String getClientOS2(int clOs, int phYr) {
        String osName = "Amdroid";
        String yearVersion = "Вам нужно установить обычную версию";
        int currentYear = LocalDate.now().getYear();
        if (clOs == 0) {
            osName = "iOS";
        }
        if (clOs == 1) {
            osName = "Amdroid";
        }
        if (phYr < currentYear) {
            yearVersion = "Вам нужно установить lite-версию";
        }
        String clientOs2 = yearVersion + " для " + osName;
        return clientOs2;
    }

    // Task 3
    public static int getDistance(int deliveryDistance) {
        int days = 0;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            days = 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
        }
        return days;
    }


    // Task 4
    public static void checkDouble(String param) {
        int check = 0;
        for (int i = 0; i < param.length() - 1; i++) {
            if (param.charAt(i) == param.charAt(i + 1)) {
                System.out.println("Дубль - " + param.charAt(i));
                check = 1;
                break;
            }
        }
        if (check == 0) {
            System.out.println("Дублей нет");
        }
    }

//    public static void checkDouble(String par) {
//        boolean checking = false;
//        for (int i = 0; i < par.length() - 1; i++) {
//            checking = par.charAt(i) == par.charAt(i + 1);
//            if (checking) {
//                System.out.println("Дубль - " + par.charAt(i));
//                break;
//            }
//        }
//        if (!checking) {
//            System.out.println("Дублей нет");
//        }
//    }

    // Task 5
    public static int[] reverseMass(int[] mass1) {
        int Temp;
        for (int i = 0; i <= (mass1.length) / 2; i++) {
            Temp = mass1[mass1.length - i - 1];
            mass1[mass1.length - i - 1] = mass1[i];
            mass1[i] = Temp;
        }
        return mass1;

    }

}
