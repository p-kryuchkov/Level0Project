import java.util.Arrays;
import java.util.Scanner;

public class ArrayI {
    public static void main(String[] args) {
        Scanner numin = new Scanner(System.in);
        System.out.println("Введите число");
        int num = numin.nextInt();
        int[] array = new int[10];
        numin.close();
        for (int i = 0; i<10; i++){
            if (num++ % 2 != 0){
                num = ++num;
            }
            array[i] = num;
        }
        String stringArray = Arrays.toString(array);
        String printArray =  stringArray.replace(',', ';');
        System.out.println(printArray);

    }
    }

