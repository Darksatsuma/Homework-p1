package HW;

import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean sim; // простое или нет
        for (int i = x; i <= y; i++) {
            sim = true;
            if (i > 1) {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        sim = false;
                        break;
                    }
                }
            }else {
                sim = false;
            }
            if (sim) {
                System.out.println(i + "составное");
            } else {
                System.out.println(i + "простое");
            }
        }
    }
}