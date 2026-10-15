
package Program;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean value = true;

        int totalParking    = 10;
        
        int availableSpace = 10;
        int occupied       = 0;
       

        while (value) {

            System.out.println("1. Car Entry");
            System.out.println("2. Car Exit");
            System.out.println("3. View Parking Status");
            System.out.println("4. View Total Earnings");
            System.out.println("5. Exit Program");
            int carEntryCount = 0;
            int carExitCount = 0;

          

            System.out.print("Enter Your Choice : ");
            int userInput = input.nextInt();

            switch (userInput) {
                case 1 -> {

                    if (availableSpace > 0 && occupied <= totalParking){
                        carEntryCount ++;
                        availableSpace = availableSpace - carEntryCount;
                        occupied = occupied + carEntryCount;
                        
                    }
                    else{
                        System.out.println("Parking space not available");
                    };

                   


                }

                case 2 -> {
                    
                    if (occupied > 0 && availableSpace <= totalParking){
                        
                        carExitCount ++;
                        availableSpace = availableSpace + carExitCount;
                        occupied = occupied - carExitCount;

                    }
                    else{
                        System.out.println("No car parked");
                    }

                }

                case 3 -> {
                    System.out.println("View Parking Status");
                    System.out.println("Occupied Sapce : "  + occupied);
                    System.out.println("Available Sapce : "  + availableSpace);
                }

                case 4 -> {
                    System.out.println("View Total Earning");
                }

                case 5 -> {
                            value = false;
                            System.out.println("available space : " + availableSpace);
                            System.out.println("occupied space : " + occupied);

                }

                default -> System.out.println("Invalid Value");
            };
            
        };

        

    };
};
