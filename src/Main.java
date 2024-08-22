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
        int sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum = sum + payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println("Задача №2");
        // найти минимальную и максимальную траты за неделю
        // создан массив с пятью целочисленными элементами и задано каждому элементу значение
        int[] expenses = {856, 5485, 362, 3995, 8174};
        // ищим максимальное значение элемента
        int maxExpenses = -1;
        int minExpenses = 999;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpenses) {
                maxExpenses = expenses[i];
            }
            // ищим минимальное значение элемента
            if (expenses[i] < minExpenses) {
                minExpenses = expenses[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + " рублей." +
                " Максимальная сумма трат за неделю составила " + maxExpenses + " рубля.");

        System.out.println("Задача №3");
        //
    }
}