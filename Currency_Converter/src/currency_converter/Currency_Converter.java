package currency_converter;

import java.util.Scanner;

public class Currency_Converter {

    public static void main(String[] args) {

        System.out.println("Enter the Currency you want to Convert: \n1.Sri lankan rupee(1) \n2.Indian Rupee(2) \n3.British Dollar(3) \n4.Australian Dollar(4) \n5.Canadian Dollar(5)");

        Scanner scan = new Scanner(System.in);
        System.out.println("Select the number: ");

        String userChoice = scan.nextLine();

        if (userChoice.equals("1")) {
            System.out.println("You selected Sri Lankan Rupee");
        } else if (userChoice.equals("2")) {
            System.out.println("You selected Indian Rupee");
        } else if (userChoice.equals("3")) {
            System.out.println("You selected British Dollar");
        } else if (userChoice.equals("4")) {
            System.out.println("You selected Australian Dollar");
        } else if(userChoice.equals("5")) {
            System.out.println("You selected Canadian Dollar");
        } else {
            System.out.println("Unknown Currency");
            System.exit(0); // Exit the program if an unknown currency is selected
        }

        System.out.println("Enter the Currency you want to Convert: \n1.American Dollar(1) \n2.Euro(2) \n3.Japanese Yen(3) \n4.New Zealand Dollar(4) \n5.Chinese Yuan(5)");

        String userInput = scan.nextLine();

        if (userInput.equals("1")) {
            System.out.println("You selected American Dollar");
        } else if (userInput.equals("2")) {
            System.out.println("You selected Euro");
        } else if (userInput.equals("3")) {
            System.out.println("You selected Japanese Yen");
        } else if (userInput.equals("4")) {
            System.out.println("You selected New Zealand Dollar");
        } else if(userInput.equals("5")) {
            System.out.println("You selected Chinese Yuan");
        } else {
            System.out.println("Unknown Currency");
            System.exit(0); // Exit the program if an unknown currency is selected
        }

        Scanner amount = new Scanner(System.in);
        System.out.println("Enter the Amount you want to convert: ");
        double amount1 = amount.nextDouble();

        if (userChoice.equals("1")) {
            
            System.out.println("Converted amount is: " + amount1 / getExchangeRate(userInput));
        } else if (userChoice.equals("2")) {
           
            System.out.println("Converted amount is: " + amount1 / getExchangeRate(userInput));
        } else if (userChoice.equals("3")) {
            
            System.out.println("Converted amount is: " + amount1 * getExchangeRate(userInput));
        } else if (userChoice.equals("4")) {
            
            System.out.println("Converted amount is: " + amount1 * getExchangeRate(userInput));
        } else if(userChoice.equals("5")) {
           
            System.out.println("Converted amount is: " + amount1 * getExchangeRate(userInput));
        } else {
            System.out.println("Unknown Currency");
        }
    }

    
    private static double getExchangeRate(String currency) {
        
        switch (currency) {
            case "1":
                return 0.012; 
            case "2":
                return 0.009; 
            case "3":
                return 1.34; 
            case "4":
                return 0.72; 
            case "5":
                return 6.37;
            default:
                return 1.0; 
        }
    }
}
