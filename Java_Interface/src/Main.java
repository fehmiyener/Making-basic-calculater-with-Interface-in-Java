import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();
        Scanner scan = new Scanner (System.in);

        System.out.print ("Enter your a: ");
        int a = scan.nextInt();
        System.out.print ("Enter your b: ");
        int b = scan.nextInt();
        

        int sum = calculator.add(a, b);
        System.out.println(a + " + " + b + " = " + sum);

        

        

        
    }
}