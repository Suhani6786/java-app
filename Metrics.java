import java.util.Scanner;

public class Metricsconvertor {

public static void main(String[] args) {
     
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to the metric converter!");
    System.out.println("Please input your conversions. For example, km, cm, ft, kg");
    System.out.println("Enter 'quit' or '-1' to exit the program");

    System.out.print("Enter your conversion (or exit to quit): ");
    String input = scanner.nextLine().toLowerCase();

     while (true) {
        if (input.equals("quit") || input.equals("-1")) {
            break;
        
        }
     
        switch (input) {

            
            case "km":
    
                System.out.println("How many km to m?");
                double km = scanner.nextDouble();
                double m = km * 1000;
                System.out.println(km + " km = " + m + " m");
                break;

            case "cm":
                System.out.println("How many cm to mm?");
                double cm = scanner.nextDouble();
                double mm = cm * 10;
                System.out.println(cm + " cm = " + mm + " mm");
                break;

            case "ft":
                System.out.println("How many ft to inches?");
                double ft = scanner.nextDouble();
                double in = ft * 12;
                System.out.println(ft + " ft = " + in + " in");
                break;

            
            case "kg":
                System.out.println("How many kg to g?");
                double kg = scanner.nextDouble();
                double g = kg * 1000;
                System.out.println(kg + " kg = " + g + " g");              
                break;

            default: 
                System.out.println("Error Input, try again");
                break;
            
        }

        System.out.print("Enter your conversion (or exit to quit): ");
        input = scanner.nextLine().toLowerCase();
        
    }
    
    scanner.close();
    

}

}


     
        


     
        
