package java_ex100;
import java.util.Scanner;

public class ex15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        System.out.printf("%d.%02d.%02d",year, month, day);
        sc.close();
    }

}