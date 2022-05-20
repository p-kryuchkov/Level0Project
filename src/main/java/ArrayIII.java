import java.util.Scanner;

public class ArrayIII {
    public static void main(String[] args) {
        Scanner arrin = new Scanner(System.in);
        Scanner numin = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arr = arrin.nextInt();
        int[] array = new int[arr];
        for (int i = 0; i < arr; i++) {

            System.out.println("Введите число");
            int num = numin.nextInt();
            array[i] = num;
        }
        int max = array[0];
        int min = array[0];
        int positionMax = 0;
        int positionMin = 0;
        for (int i = 0; i < arr; i++) {
            if (array[i] > max) {
                max = array[i];
                positionMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                positionMin = i;
            }
        }
        System.out.println("Наибольшее число в массиве: " + max + " Находится в массиве на позиции: " + (positionMax + 1));
        System.out.println("Наименьшее число в массиве: " + min + " Находится в массиве на позиции: " + (positionMin + 1));
        arrin.close();
        numin.close();
        System.out.println("Массив, где поменяли местами минимальный элемент с максимальным:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) array[i] = min;
            else if (array[i] == min) array[i] = max;
            System.out.printf("%4d", array[i]);
        }
    }
}

