public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");

        // Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 —
        // с помощью ключевого слова new
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        // Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986
        double[] array2 = {1.57, 7.654, 9.986};

        // Произвольный массив
        char[] array3 = new char[5];
        array3[0] = '#';
        array3[1] = '*';
        array3[2] = '@';
        array3[3] = '&';
        array3[4] = 'n';

        System.out.println("Задача №2");
        // Распечатайте элементы каждого массива по порядку через запятую

        // целочисленный массив
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println();

        // массив, в котором можно хранить три дробных числа
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println();

        // произвольный массив
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + ", ");
        }
        System.out.println();

        System.out.println("Задача №3");
        // Распечатать на отдельной строчке элементы каждого массива
        // в обратном порядке через запятую

        // целочисленный массив
        for (int i = 2; i >= 0; i--) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println();

        // массив, в котором можно хранить три дробных числа
        for (int i = 2; i >= 0; i--) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println();

        // произвольный массив
        for (int i = 4; i > 0; i--) {
            System.out.print(array3[i] + ", ");
        }
        System.out.println();

        System.out.println("Задача №4");
        // Пройдитесь по первому целочисленному массиву
        // и все нечетные числа в нем сделайте четными








    }
}


