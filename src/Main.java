public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        // создан массив с пятью целочисленными элементами
        int[] payments = new int[5];
        // заданы каждому элементу значения
        payments[0] = 67;
        payments[1] = 85;
        payments[2] = 78;
        payments[3] = 98;
        payments[4] = 70;
        // посчитать сумму всех выплат за месяц
        double sum = 0;
        for (int payment : payments) {
            sum += payment;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println("Задача №2");
        // найти минимальную и максимальную траты за неделю
        // создан массив с пятью целочисленными элементами и задано каждому элементу значение
        int[] expenses = {856, 5485, 362, 3995, 7174};
        // ищим максимальное значение элемента
        int maxExpenses = -1;
        int minExpenses = 9999;
        for (int expens : expenses) {
            if (expens > maxExpenses) {
                maxExpenses = expens;
            }
            // ищим минимальное значение элемента
            if (expens < minExpenses) {
                minExpenses = expens;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей." +
                " Максимальная сумма трат за неделю составила " + maxExpenses + " рубля.");

        System.out.println("Задача №3");
        // посчитать какую в среднем сумму компания тратила еженедельно
        // создаём массив с пятью целочисленными элементами и задаём каждому элементу значение
        float[] wastes = {5096, 896, 5436, 865, 180};
        // создаём переменную недель в месяце
        float weeks = 4.4f;
        // создаём переменную средняя трата за месяц
        float averageSum = 0;
        // создаём переменную средняя трата в неделю
        float averageSpendingPerWeek = 0;
        for (float wastest : wastes) {
            sum += wastest;
            averageSum = (float) (sum / wastes.length);
            averageSpendingPerWeek = averageSum / weeks;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей." +
                " По " + averageSpendingPerWeek + " рублей в неделю.");

        System.out.println("Задача  №4");
        // дан массив символов
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        // развернём содержимое массива
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        // 2-я версия решения +
        int length = reverseFullName.length;
        for (int i = 0; i < length / 2; i++) {
            char cash = reverseFullName[i];
            reverseFullName[i] = reverseFullName[length - 1 - i];
            reverseFullName[length - 1 - i] = cash;
        }
        System.out.println(reverseFullName);
    }
}