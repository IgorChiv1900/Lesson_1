//14. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
public class Main {
    public static void main(String[] args) {
        // Вызов метода и проверка его работы
        int len = 5;
        int initialValue = 10;
        int[] resultArray = createArray(len, initialValue);

        // Печать результата для проверки
        System.out.print("Resulting array: ");
        for (int value : resultArray) {
            System.out.print(value + " ");
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
