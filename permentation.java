package HW;

import java.util.Scanner;

public class permentation {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов в перестановке! ");
        n = sc.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = i + 1;
        }
        prmt(array1, 0);
    }

    private static void prmt(int[] array1, int i) {
        if (i == array1.length) {
            arraout(array1);
        } else {
            for (int j = i; j < array1.length; j++) {

                aswap(array1, i, j);
                prmt(array1, i + 1);
                aswap(array1, i, j);

            }
        }
    }

    private static void aswap(int[] array1, int i, int j) {
        int k = array1[i];
        array1[i] = array1[j];
        array1[j] = k;
    }

    private static void arraout(int[] array1) {
        String s = "";
        for (int a : array1) {
            s += a + ", ";
        }
        s = s.substring(0, s.length() - 2);
        System.out.println(s);
    }
}