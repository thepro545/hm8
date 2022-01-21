package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
// Task 1
        int year = 2022;
        int leapYear = checkLeapYear(year);

// Task 2
        // int currentYear = LocalDate.now().getYear();
        String osName = "Android";
        ;
        int clientOS = getClientOS(osName);
        if (clientOS == 0) {
            osName = "iOS";
        }
        String clientYear = getClientYear();
        System.out.println(clientYear + " для " + osName);

// Task 3
        int days = 0;
        days = getDistance(days);
        System.out.println("Потребуется дней: " + days);

// Task 4
        String param = "aabccddefgghiijjkk";
        checkDouble(param);

// Task 5
        int [] mass1 = new int[]{3, 2, 1, 6, 5};
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


    // Task 2 Пока сложнова-то. 2 значения в 1 метод не могу поставить, мб попозже подправлю. Но код работает
    public static int getClientOS(String name) {
        if (name.equals("Android")) {
            return 1;
        } else {
            return 0;
        }
    }

    public static String getClientYear() {
        int phoneYear = 2020;
        String yearVersion = "Вам нужно установить обычную версию";
        int currentYear = LocalDate.now().getYear();
        if (phoneYear < currentYear) {
            yearVersion = "Вам нужно установить lite-версию";
        }
        return yearVersion;
    }

    // Task 3
    public static int getDistance(int day) {
        int deliveryDistance = 95;
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
    public static void checkDouble(String par) {
        int check = 0;
        for (int i = 0; i < par.length() - 1; i++) {
            if (par.charAt(i) == par.charAt(i + 1)) {
                System.out.println("Дубль - " + par.charAt(i));
                check = 1;
                break;
            }
        }
        if (check == 0) {
            System.out.println("Дублей нет");
        }
    }

// Task 5
    public static int[] reverseMass (int [] mass1){
        int Temp;
        for (int i = 0; i <= (mass1.length) / 2; i++) {
            Temp = mass1[mass1.length - i - 1];
            mass1[mass1.length - i - 1] = mass1[i];
            mass1[i] = Temp;
        } return mass1;

    }

}
