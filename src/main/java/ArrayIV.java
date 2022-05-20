import java.util.Scanner;
import java.util.Arrays;
public class ArrayIV {
    public static void main(String[] args) {
        Scanner hin = new Scanner(System.in);
        Scanner numin = new Scanner(System.in);
        System.out.println("Введите размер массива по горизонтали");
        int h = hin.nextInt();
        int[][] array = new int[2][h];
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < 2; i++) {
            if (i == 0){
                System.out.println("Первая строка");
            }
            if (i == 1){
                System.out.println("Вторая строка");
            }
            for (int k = 0; k < h; k++) {
                System.out.println("Введите число");
                int num = numin.nextInt();
                array[i][k] = num;
                if (i == 0){
                    sum1 = sum1 + num;
                }
                if (i == 1){
                    sum2 = sum2 + num;
                }
            }
        }
        System.out.println("Среднее арифметическое первой строки: " + (sum1/h));
        System.out.println("Среднее арифметическое второй строки: " + (sum2/h));
        hin.close();
        numin.close();
    }

}