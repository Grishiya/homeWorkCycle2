public class Main {
    public static void main(String[] args){
        task1();
        task2();

    }
    public static void task1(){
        System.out.println("Задача 1.");
        int money = 0;
        int month = 0;
        int postponed=15000;
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

}
