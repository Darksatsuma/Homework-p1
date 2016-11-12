package HW;
import java.util.Scanner;
public class induvid_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a[] = new int[5];
        int max=-1, min=100000001, m=0;
        int n=sc.nextInt();
        for (int i=0; i<5;i++){
            a[i]= sc.nextInt();
            if (a[i]>max){
                max=a[i];
            }
            if (a[i]<min){
                min=a[i];
            }
            m=max-min;
        }
        if(n==5){
            System.out.println("разница "+m);
            return;
        }
        for(int i=1;i<=n-5;i++){
            max=-1;
            min=100000001;
            for (int j=0; j<4;j++){
                a[j]=a[j+1];
                System.out.print(a[j]+" ");
            }
            a[4]= sc.nextInt();
            for (int j=0; j<5;j++){
                if (a[j]>max){
                    max=a[j];
                }
                if (a[j]<min){
                    min=a[j];
                }
                if (m<max-min){
                    m=max-min;
                }
            }
        }
        System.out.println("Разница "+m);
    }
}
