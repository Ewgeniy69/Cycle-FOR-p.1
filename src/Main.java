public class Main {
    public static void main(String[] args) {
//        int salary = 65535;
//        int total = 0;
//        for (int i = 0; i < 12; i++) {
//            total = total + total/100;
//            total = total + salary;
//            System.out.println("Месяц " + i + " Итого " + total);
//        }
//        System.out.println(total);
        System.out.println("Домашнее задание. Курс");
        System.out.println("Задание № 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        System.out.println("Задание № 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        System.out.println("Задание № 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        System.out.println("Задание № 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        System.out.println("Задача № 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Задача № 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        System.out.println("Задача № 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        System.out.println("Задача № 8");
        int bank = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + bank;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("Задача № 9");
        total = 0;
        for (int i = 1; i <= 12; i++) {
            int percent = total / 100;
            total = total + percent;
            total = total + bank;
            if (i == 1 || i == 2 || i == 12) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей. Прибавка в месяц на " + percent + " рублей");
            }
        }

        System.out.println("Задача № 10");

        int num = 2;
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + "*" + i + " = " + result);
        }

        System.out.println("Задачи для закрепления от ИИ");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        int product = 1;
        for (int i = 1; i <= 10; i++) {
            product = product * i;
        }
        System.out.println(product);

        int count = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Четные числа - " + count);

        num = 3;
        for (int i = 1; i <= 10; i++) {
            int res = num * i;
            System.out.println(num + " * " + i + " = " + res);
        }

        int pointTwo = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                pointTwo = pointTwo + i;
            }
        }
        System.out.println(pointTwo);

        for (int i = 1; i <= 20; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
