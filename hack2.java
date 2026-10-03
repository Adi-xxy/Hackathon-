//Question 2 answer
import java.util.Scanner;

public class hack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the waste in KG: ");
        double wasteInKg = sc.nextDouble();
        System.out.println("The waste collected is: " + wasteInKg + " KG");
        if (wasteInKg > 100) {
            System.out.println("The Collection target achieved.");
        } else if (wasteInKg < 100) {
            System.out.println("The Collection target not achieved.");
        
        }
    }
}

