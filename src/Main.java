public class Main {
    public static void main(String[] args) {

        System.out.println("task1");
        double salary = 15000;
        double total = 0;
        int month = 0;
        while (total < 2495000) {
            total = total + salary;
            total *= 1.01;
            month++;
            System.out.printf("Месяц %s, сумма накопления равна %.2f рублей\n", month, total);
        }
        System.out.println("______________________________");

        System.out.println("task2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("______________________________");

        System.out.println("task3");
        int year = 2024;
        int peopleAmountCurrent = 12_000_000;
        int peopleIncrease = peopleAmountCurrent / 1000 * 17;
        int peopleDecrease = peopleAmountCurrent / 1000 * 8;
        int peopleAmountOneYear = peopleIncrease - peopleDecrease;
        for (int j = 0; j <= 10; j++) {
            peopleAmountCurrent = peopleAmountCurrent + peopleAmountOneYear;
            year++;
            System.out.printf("%s, численность населения %s\n", year, peopleAmountCurrent);
        }
        System.out.println("______________________________");

        System.out.println("task4");
        double deposit = 15000;
        for (int j = 1; deposit <= 12_000_000; j++) {
            deposit *= 1.07;
            System.out.printf("%s-й месяц, сумма - %.2f рублей\n", j, deposit);
        }
        System.out.println("______________________________");

        System.out.println("task5");
        double depositNew = 15000;
        for (int j = 1; depositNew <= 12_000_000; j++) {
            depositNew *= 1.07;
            if (j % 6 == 0) {
                System.out.printf("%s-й месяц, сумма - %.2f рублей\n", j, depositNew);
            }
        }
        System.out.println("______________________________");

        System.out.println("task6");
        double depositTwo = 15000;
        for (int j = 1; j <= 108; j++) {
            depositTwo *= 1.07;
            if (j % 6 == 0) {
                System.out.printf("%s-й месяц, сумма - %.2f рублей\n", j, depositTwo);
            }
        }
        System.out.println("______________________________");

        System.out.println("task7(Мое решение)");
        int firstFriday = 1;
        for (; firstFriday < 31; firstFriday += 7) {
            System.out.println("Сегодня пятница " + firstFriday + "-e число. Необходимо подготовить отчет.");
        }
        System.out.println();

        System.out.println("task7_1(Списано)");
        int friday = 6;
        for (int j = friday; j < 31; j += 7) {
            System.out.println("Сегодня пятница" + friday + "-e число. Необходимо подготовить отчет.");
        }
        System.out.println("______________________________");

        System.out.println("task8(Мое решение)");
        //Оно было бы более-менее верным, если бы изначально был известен конкретный год первого появления кометы
        int cometAppearanceYear = 1896;
        int currentYear = 2024;
        for (; cometAppearanceYear < currentYear + 100; cometAppearanceYear += 79) {
            System.out.println(cometAppearanceYear);
        }
        System.out.println();

        System.out.println("task8_1(Cписано...)");
        int currentYear1 = 2024;
        int begin = currentYear1 - 200;
        int end = currentYear1 + 100;
        for (int j = 0; j < end; j += 79) {
            if (j >= begin) {
                System.out.println(j);
            }
        }
    }
}