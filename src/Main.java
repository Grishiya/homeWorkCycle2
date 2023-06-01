public class Main {
    public static void main(String[] args){
        task1();

    }
    public static void task1(){
        System.out.println("Задача 1");
        int money = 0;
        int month = 0;
        int postponed=15000;
        for (; money <= 2_459_000; month++) {

            money = money + postponed;
            System.out.println("Месяц " + month + " сумма накоплений равна " + money + ".");
        }

    }

}
