import java.util.Scanner;

public class CelciusToFahren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celcius = sc.nextDouble();
        double fahren = (celcius * 9 / 5) + 32;
        System.out.println("Temperature in Fahren is " + fahren);
        sc.close();
    }
}