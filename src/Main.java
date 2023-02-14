public class Main {
    public static void main(String[] args) {
        //task 1.1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task 2.1
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task 3.1
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task 4.1
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task 1.2
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        //task 2.2
        int number = 7;
        for (int i = 1; i <= 14; i++) {
            System.out.print(number * i + " ");
        }
        System.out.println();

        //task 3.2
        int num = 1;
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(num * i + " ");
        }
        System.out.println();

        //task 1.3
        double salary = 29_000;
        for (int i = 1; i <= 12; i++) {
            System.out.println("месяц " + i + " сумма накоплений равна " + salary * i + " рублей");
        }
        System.out.println();

        //task 2.3
        double sum = 0;
        double procent = 0.01;
        for (int i = 1; i <= 12; i++) {
            sum = (sum+salary)*(1+procent);
            System.out.println(sum);
        }
        System.out.println();

        //task 1.1 part 2
        int s=0;
        int month=0;
        while (s <= 2_459_000) {
            s+=15_000;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + s + " рублей");
        }

        //task 2.1 part 2
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        //task 3.1 part 2
        int people = 12_000_000;
        int baby = 17;
        int kill = 8;
        int years = 10;
        int a = baby - kill;
        for (int j = 1; j <= years; j++) {
            people += people*a/1000;
            System.out.println("Год " + j + " численность населения составляет " + people);
        }

        //task 1.2, 2.2 part 2
        int start = 15000;
        double m = 0.07;
        int mon = 1;
        do {
            start+=start*m;
            if (mon % 6 ==0) System.out.println(start + " " + mon);
            mon++;
        }
        while (start<=12000000);
        System.out.println();

        //task 3.2 part 2
        int now = 15000;
        double m1 = 0.07;
        int mon1 = 1;
        do {
            now+=now*m1;
            if (mon1 % 6 ==0) System.out.println(now + " " + mon1);
            mon1++;
        }
        while (mon1<=9*12);
        System.out.println();

        //task 4.2 part 2
        int friday = 3;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
        }
        while (friday <= 31);
        System.out.println();

        //task 1.3 part 2
        int yearComet = 0;
        int yearNow = 2023;
        do {
            if (yearComet >= yearNow - 200) System.out.println(yearComet);
            yearComet+=79;
        }
        while (yearComet<=yearNow + 100);
        System.out.println();

        //task 2.3 part 2
        for (int j = 1; j <= 10; j++) {
            System.out.println("2 * " + j + " = " + 2*j);
        }
    }
}