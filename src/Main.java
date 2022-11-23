import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        int r = h - b;
        int f = a - b;
        int result = (r+f-1) / f;
        if (result <0) {
            System.out.println ("Impossible");
        }else {
            System.out.println (result);
        }
    }
}