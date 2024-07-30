import java.util.Arrays;

//1.Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
public class printThreeWords {
    public static void main(String[] args) {
        String s1 = "Orange";
        System.out.println(s1);
        String s2 = new String ("Banana");
        System.out.println(s2);
        String s3 = new String ("Apple");
        System.out.println(s3);
    }
}
//2.Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные,
// и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
// в противном случае - “Сумма отрицательная”;
class CheckSumSign {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        if (a - b >= 0) {
            System.out.println("Сумма положительная");
        } else if (a - b < 0) {
            System.out.println("Сумма отрицательная");
        }
    }
}
//3.Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
class printColor {
    public static void main(String[] args) {
        int value = 2000;
        int d = 0;
        int b =100;
        if (value <= d) {
            System.out.println("Красный");
        }
        else if (d >= value)  {
            if ( b < value )
                System.out.println("Зеленый");
        }
        else {
            System.out.println("Желтый");
        }
    }
}
//4.Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
class compareNumbers {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        if (a >= b) {
            System.out.println("a >= b");
        } else if (a < b) {
            System.out.println("a < b");
        }
    }
}
//5.Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
class sumNumbers {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 10;
        int f = 20;
        if ((a+b) > c ) {
            if ((a+b) < f )
                System.out.println(true); }
        if ((a+b) < c )
            System.out.println(false);{
            if ((a+b) > f )
                System.out.println(false);}

    }
}
//6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
class Numbers {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;
        if (a >= b) {
            System.out.println("Положительное число");
        } else if (a < b) {
            System.out.println("Отрицательное число");
        }
    }
}
//7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
//Замечание: ноль считаем положительным числом.
class NumbersTrue {
    public static void main(String[] args) {
        int a = -5;
        int b = 0;
        if (a < b) {
            System.out.println("true");
        } else if (a >= b) {
            System.out.println("false");
        }
    }
}
//8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
class RepString {
    public static void main(String[] args) {
        int a = 3;
        String str = "ABS";
        String repeated = str.repeat(a);
        System.out.println( repeated );
    }
}
//9.Напишите метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
class Year {
    public static void main(String[] args) {
        int year = 1800;
        if (year % 4 == 0) {
            System.out.println("False");}
        else if (year % 100 == 0) {
            System.out.println("False");}
        else if (year % 400 == 0){
            System.out.println("False");}
        else System.out.println("True");
    }

}
//10.Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
class MainClass {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i]++;
            else
                arr[i]--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
//11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
class Numss {
    public static void main(String[] args) {
        int [] numss = new int[101];
        for(int i = 0; i < 101; i++)
            numss [i] = i;{
            System.out.println(Arrays.toString(numss));}
    }
}
//12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
class Numsss {
    public static void main(String[] args){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
//13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
class Diagonal {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int[][] arr = new int[x][y];
        for (int i = 0; i < arr.length; i++) {
            arr[i][arr.length - i - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][i] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
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