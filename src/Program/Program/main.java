
package Program;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean value = true;

        int totalParking    = 10;
        
        int availableSpace = 10;
        int occupied       = 0;
        double fees           = 0;
        double totalEarning   = 0;
        double rate           = 30;
       

        while (value) {

            System.out.println("1. Car Entry");
            System.out.println("2. Car Exit");
            System.out.println("3. View Parking Status");
            System.out.println("4. View Total Earnings");
            System.out.println("5. Exit Program");
        
        
            
            

          

            System.out.print("Enter Your Choice : ");
            int userInput = input.nextInt();

            switch (userInput) {
                case 1 -> {

                    if (availableSpace > 0){
                        availableSpace--;
                        occupied++;
                        System.out.println("Car Enter Successfully");
                        
                    }
                    else{
                        System.out.println("Parking space not available");
                    };

                   


                }

                case 2 -> {
                    
                    if (occupied > 0){
                        
                        System.out.print("Please Entry your total hours : ");
                        double hour = input.nextDouble();

                        if (hour > 0){

                            fees = (hour * rate);
                            totalEarning = totalEarning + fees;
                            availableSpace++;
                            occupied--;

                            System.out.println("Car exit successfully");
                            System.out.println("Fees : " + fees);


                        }
                        else{
                            System.out.println("Invalid duration reject karo");
                        };            

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
                    System.out.println("Total Earning : " + totalEarning);
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
