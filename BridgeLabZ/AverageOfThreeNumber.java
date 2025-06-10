import java.util.Scanner;

public class AverageOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        int sum = a + b + c;
        double average = (double) sum / 3;
        System.out.printf("Average of three number is: %.2f ",average);
        sc.close();
    }
}