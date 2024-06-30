public class TaskMethods {
    //1. Создайте метод printThreeWords(),
    // который при вызове должен отпечатать в столбец
    // три слова: Orange, Banana, Apple.
    public void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    // Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
    // значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или
    // равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    public void checkSumSign(int a, int b) {
        int sum = a + b;
        String result = (sum >= 0) ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(result);
    }

    //3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
    // Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах
    // от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
    public void printColor(int value) {

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    //4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
    // значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в
    // противном случае “a < b”;
    public void compareNumbers(int a, int b) {
        String result = (a >= b) ? "a >= b" : "a < b";
        System.out.println(result);
    }

    //5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    // (включительно), если да – вернуть true, в противном случае – false.
    public boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    //6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public void printPositivity(int number) {
        String positivity = (number >= 0) ? "Число положительное" : "Число отрицательное";
        System.out.println(positivity);
    }

    //7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
    // отрицательное, и вернуть false если положительное.
    //Замечание: ноль считаем положительным числом.
    public boolean isNegative(int number) {
        boolean result = number < 0;
        System.out.println("Number " + number + " is negative: " + result);
        return result;
    }

    //8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
    // указанную строку, указанное количество раз;
    public void repeatString(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
        System.out.println("String '" + str + "' repeated " + times + " times");
    }

    //9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не
    // високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public boolean isLeapYear(int year) {
        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (leap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        return leap;
    }

    //10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }

        System.out.println("Inverted array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    //11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
    public void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println("Filled array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    //12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        // Выводим массив после модификации
        System.out.println("Modified array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    //13
    public static int[][] fillDiagonal(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Размер массива должен быть больше нуля");
        }
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
        }

        return matrix;
    }

    //14
    public static int[] initializeArray(int len, int initialValue) {
        if (len < 0) {
            throw new IllegalArgumentException("Длина массива не может быть отрицательной");
        }

        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
