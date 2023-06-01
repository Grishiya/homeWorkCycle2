public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1.");
        int money = 0;
        int month = 0;
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
        int thousandsPeopleCountryY = contryY / 1000;
        int totalLifePeopleYear = thousandsPeopleCountryY * lifePeopleOn1000;

        for (int i = 1; i <= 10; i++) {
            contryY = contryY + totalLifePeopleYear;
            System.out.println("Год " + i + " численность населения составляет " + contryY);
        }
    }

    public static void task4() {
        System.out.println("Задача 4.");
        double money = 15000.0;
        double vklad = 15000.0;
        double percent = money / 93;
        for (int month = 1; vklad <= 1200000; month++) {
            vklad = vklad + percent;
            vklad = (int) (vklad);
            System.out.println(month + " месяц,денег на счете" + vklad + "рублей.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double money = 15000.0;
        double vklad = 15000.0;
        double percent = money / 93;
        for (int month = 1; vklad <= 1200000; month++) {
            vklad = vklad + percent;
            vklad = (int) (vklad);
            if (month % 6 == 0) {
                System.out.println(month + " месяц,денег на счете" + vklad + "рублей.");
            }
        }
    }

}