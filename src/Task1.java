public class Task1 {
    //посчитать факториал числа n
    //0.5 балла - если посчитаете в цикле
    //1 балл - если посчитаете рекурсией
    static int fact(int x){
        if (x == 1) {
            return 1;
        }
        return x * fact(x - 1);
    }

    //вывести таблицу умножения на экран - 1 балл
    //подсказка - использовать двойной for
    public static void table() {
        for (int i = 1; i < 11; i++) {
            for (int k = 1; k < 11; k++
            ) {
                System.out.print(k * i + "\t");
            }
            System.out.println("");
        }
    }

    //посчитать сумму цифр числа
    //можно посчитать для трехзначного - 0.5 балла
    //для любого числа - 1 балл
    //подсказка - в случае для любого числа используйте while
    public static int sum(int n) {
        int a = 0;
        while (n != 0) {
            a = a + n%10;
            n = n / 10;
        }
        return a;
    }

    //определить, является ли год високосным
    //В високосном году - 366 дней, тогда как в обычном - 365.
    //Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
    //Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
    //Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
    //Годы 2100, 2200 и 2300 - не високосные.
    //за правильный ответ - 0.5 балла
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //здесь вам нужно будет использовать результат прошлой задачи
    //и вывести, сколько дней в году
    //правильный ответ - 0.5 балла
    public static int daysInYear(int year) {
        if (isLeapYear(year) == true) {
            return 366;
        } else {
            return 365;
        }
    }

    //определить номер дня недели по строке
    //например: Понедельник - 1
    //правильный ответ - 1 балл
    public static int dayOfTheWeek(String n) {
        String[] days = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        for (int i = 0; i < 7; i++) {
            if (n.equals(days[i])) {
                return i + 1;
            }
        }
        return 0;
    }

    //вывести массив на экран в виде: [1, 5, 3, 7, 10, 2, 5]
    //правильное решение - 0.5 балла
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i ++){
            System.out.print(array[i]);
            if (i != array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    //вывести двойной массив на экран в виде:
    // [1, 5, 3, 7, 10, 2, 5]
    // [1, 5, 3, 7, 10, 2, 5]
    // ...
    //правильное решение - 0.5 балла
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i ++){
            System.out.print("[");
            for (int k = 0; k < array[0].length; k ++){
                System.out.print(array[i][k]);
                if (k != array[i].length - 1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }


    //отсортировать одномерный массив в порядке возрастания
    //если не знаете, как сортировать, то подсказка -
    //метод пузырька (один из самых простых для понимания)
    //правильный ответ - 1 балл
    public static int[] sort(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    isSorted = false;
                    int g = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = g;

                }
            }
        }
        return array;
    }


    //здесь можете тестировать свои решения
    public static void main(String[] args) {
        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2019));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek("Понедельник"));

        int[] array1D = {1, 5, 3, 7, 10, 2, 5};
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));

        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1, 5, 3, 7, 10, 2, 5}, {1, 5, 3, 7, 10, 2, 5}};
        printArray(array2D);
    }
}