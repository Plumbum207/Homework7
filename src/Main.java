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
        System.out.println("Задача 1");
        int deposit = 15_000;
        int goal = 2_459_000;
        int total = 0;
        double percent = 0.01;
        int month = 0;

        while (total < goal) {
            total += deposit + total * percent;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17 * (population / 1000);
        int deathRate = 8 * (population / 1000);
        int years = 0;

        while (years < 10) {
            years++;
            population += birthRate - deathRate;
            System.out.println("Год " + years + " численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int goal = 12_000_000;
        int total = 15000;
        double percent = 0.07;
        int month = 0;

        while (total <= goal) {
            total += total * percent;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 4");
        int goal = 12_000_000;
        int total = 15000;
        double percent = 0.07;
        int month = 0;

        while (total <= goal) {
            total += total * percent;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int total = 15000;
        double percent = 0.07;
        int month = 0;
        int goal = 12 * 9;

        while (month <= goal) {
            total += total * percent;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int fridayDay = 1;
        int days = 31;

        while (fridayDay <= days) {
            fridayDay += 7;
            System.out.println("Сегодня пятница, " + fridayDay + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int cometCycle = 79;
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int year = 0;

        while (year < 2200) {
            year += cometCycle;
            if (year > startYear && year < endYear) {
                System.out.println(year);
            }
        }
    }
}