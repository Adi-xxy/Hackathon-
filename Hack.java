// Question 3A
import java.util.Scanner;

public class Hack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vehical number - ");
        int vehnum = sc.nextInt();
        System.out.println("Enter Amount of Waste Collected - ");
        float collec_waste = sc.nextFloat();
        System.out.println("Enter Number of collection Points - ");
        int collection_point = sc.nextInt();
        System.out.println("If above vehicle is On-Duty, enter 'O' ");
        System.out.println("If above vehicle is Free, enter 'F' ");
        char status = sc.next().charAt(0);

        
        System.out.println("Vehicle number - "+vehnum);
        System.out.println("Amount of Waste collected - "+collec_waste);
        System.out.println("Collection points - "+collection_point);
        System.out.println("Status of vehicle - "+status);
        sc.close();
    }
}
         

        
    

    
    
