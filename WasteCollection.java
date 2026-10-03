import java.util.Scanner;

 class WasteCollection 
{

        public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter waste collected at collection point 1 (kg): ");
        double point1Waste = sc.nextDouble();

        System.out.print("Enter waste collected at collection point 2 (kg): ");
        double point2Waste = sc.nextDouble();

        double total = calculateTotalWaste(point1Waste, point2Waste);

        System.out.println("Total waste collected: " + total + " kg");

        
    }
}