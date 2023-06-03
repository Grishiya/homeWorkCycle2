public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1.");
        int money = 0;
        int month = 1;
        int postponed = 15000;
        for (; money <= 2_459_000; month++) {

            money = money + postponed;
            System.out.println("Месяц " + month + " сумма накоплений равна " + money + ".");
        }

    }

    public static void task2() {
        System.out.println("Задача 2.");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (int b = 10; b >= 1; b--) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    public static void task3() {
        int contryY = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int lifePeopleOn1000 = birthRate - mortality;


        for (int i = 1; i <= 10; i++) {
            contryY = contryY + (contryY / 1000 * lifePeopleOn1000);
            System.out.println("Год " + i + " численность населения составляет " + contryY);
        }
    }

    public static void task4() {
        System.out.println("Задача 4.");
        double vklad = 15000.0;
        double percent = 1.07;
        int month = 0;
        for (; vklad <= 12000000.0; month++) {
            vklad = vklad * percent;
            System.out.printf("Месяц %d: денег на счете %.2f рублей %n", month, vklad);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double vklad = 15000.0;
        double percent = 1.07;
        for (int month = 0; vklad <= 12000000; month++) {
            vklad = vklad * percent;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d: денег на счете %.2f рублей %n", month, vklad);
            }
        }
    }

    public static void task6() {
        int nineYear = 12 * 9;
        double vklad = 15000;
        double percent = 1.07;
        for (int month = 1; ; month++) {/* Знаю,что можно сделать так
        for(int month=1;month<=nineYear;month++) */
            vklad = vklad * percent;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d: денег на счете %.2f рублей %n", month, vklad);
                if (month == nineYear) break;//но хотел попробовать так
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7.");
        int firstFriday = 3;
        int dayInWeek = 7;
        int dayInMonth = 31;
        for (; firstFriday < dayInMonth; firstFriday += dayInWeek) {
            System.out.println("Сегодня пятница" + firstFriday + "-е число. Не забудтье подготовить отчет.");
        }
    }

    public static void task8() {
        int nowYear = 2023;
        int twoHundredYearsAgo = nowYear - 200;
        int oneHundredAfterYears = nowYear + 100;
        int comet = 79;
        for (int year = 0; year <= oneHundredAfterYears; year += comet) {
            if (year > twoHundredYearsAgo)
                System.out.println(year);
        }
    }
}