package HW;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        boolean sim = true;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == 0 || x == 1) {
            sim = false;
        } else {
            for (int i = 2; i < Math.sqrt(x); i++) {
                if (x % i == 0) {
                    sim = false;
                    break;
                }
            }
        }
        if (sim) {
            System.out.println("число простое");
        } else {
            System.out.println("число составное");
        }
    }
}

