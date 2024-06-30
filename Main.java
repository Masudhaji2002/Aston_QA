public class Main {
    public static void main(String[] args) {
        TaskMethods methods = new TaskMethods();
        int[] array = new int[100];
        int[] array1 = {0, 1, 1, 0, 0, 1, 1, 0, 1};
        int[] array2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int n = 5; // Размерность массива
        int[][] matrix = TaskMethods.fillDiagonal(n);
        int len = 10;
        int initialValue = 5;
        int[] array4 = TaskMethods.initializeArray(len, initialValue);
        methods.printThreeWords();
        methods.checkSumSign(10, -6);
        methods.compareNumbers(10, 5);
        methods.isSumBetween10And20(5, 7);
        methods.printPositivity(5);
        methods.isNegative(-4);
        methods.repeatString("Hello world!", 10);
        methods.isLeapYear(15);
        methods.invertArray(array1);
        methods.fillArray(array);
        methods.modifyArray(array2);
        System.out.println("Matrix with filled diagonal:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Initialized array:");

        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i] + " ");
        }
        System.out.println();
    }
}
