public class Main {
    public static void main(String[] args) {
        //Task1 ?
        int salary2 = 15000;
        int total2 = 0;
        int i = 0;
        while (total2 < 2_459_000) {
            total2 = total2 + total2 / 100;
            total2 = total2 + salary2;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
        }

        //Task2
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a = a + 1;
        }
        System.out.println();
        for (int s = 10; s >= 1; s--) {
            System.out.print(s + " ");
        }
        System.out.println();

        //Task3
        int Y = 12_000_000;
        for (i = 1; i <= 10; i++) {
            int brithRate = 17 * Y / 1000;
            int deathRate = 8 * Y / 1000;
            Y = Y + brithRate - deathRate;
            Y -= deathRate;
            System.out.println("Год " + i + ", численность " + Y);
        }
        //Task4,5
        int salaryBasya = 15000;
        int totalBasya = 0;
        int q = 0;
        while (totalBasya <= 12_000_000) {
            totalBasya = totalBasya + totalBasya/100*7;
            totalBasya = totalBasya + salaryBasya;
            q++;
            if (q % 6 == 0) {
                System.out.println("Месяц " + q + ", сумма накоплений равна " + totalBasya + " рублей");
            }
        }

        //Task6
        int salaryBasya1 = 15000;
        int totalBasya1 = 0;
        int q1 = 0;
        while (q1 < 12*9) {
            totalBasya1 = totalBasya1 + totalBasya1/100*7;
            totalBasya1 = totalBasya1 + salaryBasya1;
            q1++;
            if (q1 % 6 == 0) {
                System.out.println("Месяц " + q1 + ", сумма накоплений равна " + totalBasya1 + " рублей");
            }
        }

        //Task7
        int firstFriday = 4;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
                System.out.println("Сегодня пятница, " + currentFriday + "-е, число. Необходимо подготовить отчет");
            }

        //Task8
        int currentYear = 2023;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int w = beginning; w < ending; w++) {
            if (w % 79 == 0) {
                System.out.println(w);
            }
        }
    }
}