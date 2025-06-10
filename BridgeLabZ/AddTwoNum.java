import java.util.Scanner;

public class AddTwoNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("The sum of %d and %d is %d",a,b,a+b);
        sc.close();
    }
}
