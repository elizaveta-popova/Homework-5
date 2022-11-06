public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
       for (int i = 1; i<=10; i++) {
           System.out.println("Итерация " + i);
       }
        //Задача 2
        System.out.println("Задача 2");
       for (int a = 10; a >= 1; a--) {
           System.out.println("Итерация " + a);
       }
        //Задача 3
        System.out.println("Задача 3");
       for (int b = 0; b <= 17; b = b + 2) {
           System.out.println("Итерация " + b);
       }
           System.out.println("Итерация ");
        //Задача 4
        System.out.println("Задача 4");
       for (int c = 10; c <= 10 && c >= -10; c--) {
           System.out.println("Итерация " + c);
       }
        //Задание 1
        System.out.println("Задание 1");
       for (int year = 1904; year <= 2096; year = year + 4) {
           System.out.println(year + " год является високосным.");
       }
        //Задание 2
        System.out.println("Задание 2");
       for (int numbers = 7; numbers < 100; numbers = numbers + 7) {
           System.out.println(numbers);
       }
        //Задание 3
        System.out.println("Задание 3");
       for (int numbers1 = 1; numbers1 <= 512; numbers1 = numbers1 * 2) {
           System.out.println(numbers1);
       }
        //Задача 1
        System.out.println("Задача 1");
       int income = 29000;
       int total = 0;
       for (int i = 1; i <= 12; i++) {
           total = total + income;
           System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей.");
       }
        //Задача 2
        System.out.println("Задача 2");
        int deposit = 29000;
        int totalSum = 0;
        for (int i = 1; i <= 12; i++) {
            totalSum = totalSum + totalSum/100;
            totalSum = totalSum + income;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalSum + " рублей.");
        }
    }
}