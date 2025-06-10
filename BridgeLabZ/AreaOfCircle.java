import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("The area of the circle is %.2f", area);
        sc.close();
    }
}
