public class Hack3 {
    public static double calculateTotalWaste(double point1waste, double point2waste) {
        double total = point1waste + point2waste;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(calculateTotalWaste(18.0, 9.0));
    }
}