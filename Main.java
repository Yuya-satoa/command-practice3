import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner  x = new Scanner(System.in);

        System.out.print(" height(m) add");
    double height = x.nextDouble();
        System.out.print(" weight(Kg) add");
    double weight = x.nextDouble();

    double bmi = weight/Math.pow(height,2);
 
    System.out.println("BMI is" + bmi );
    System.out.println("BMI is" + bmi );
    }
}