import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Chase Struse on 10/13/17.
 * Email: chasestruse@gmail.com
 */
public class VendingMachineImplementation{

    public static void main(String[] args){

        VendingMachine machine = new VendingMachine();

        Scanner userInput = new Scanner(System.in);

        double total = 0;

        int colaWanted = 0, chipsWanted = 0, candyWanted = 0;
        int userSelection;

        String change;

        final DecimalFormat formatMoney = new DecimalFormat("#0.00");

        boolean keepGoing = true;

        System.out.println("Hello and welcome to Chase's awesome vending machine");

        /*
        *
        * This loop will ask the user to select if they would like Cola,Chips, or Candy
        * it will then add the correct amount to the total as well as add to either
        * colaWanted chipsWanted or candyWanted
         */

        while(keepGoing){
            machine.outputSelectionScreen();
            userSelection = userInput.nextInt();

            if(userSelection == 1 && machine.machineQuantity(1,"Cola")){
                colaWanted++;
                total += 1.0;
            }
            else if(userSelection == 2 && machine.machineQuantity(1, "Chips")){
                chipsWanted++;
                total += .65;
            }
            else if(userSelection == 3 && machine.machineQuantity(1, "Candy")){
                candyWanted++;
                total += .50;
            }
            else if(userSelection == 1 && !machine.machineQuantity(1, "Cola")){
                System.out.println("COLA OUT OF STOCK");
            }
            else if(userSelection == 2 && !machine.machineQuantity(1, "Chips")){
                System.out.println("CHIPS OUT OF STOCK");
            }
            else if(userSelection == 3 && !machine.machineQuantity(1, "Candy")){
                System.out.println("CANDY OUT OF STOCK");
            }
            else{
                System.out.println("Please make sure to enter 1, 2, or 3");
            }

            System.out.println("Enter 1 to select another");
            System.out.println("Enter 2 to pay");

            userSelection = userInput.nextInt();

            if(userSelection == 1){
                keepGoing = true;
            }
            else if(userSelection == 2){
                keepGoing = false;
            }
            else{
                System.out.println("Please enter 1 or 2");
                userSelection = userInput.nextInt();

                if(userSelection == 1){
                    keepGoing = true;
                }
                else if(userSelection == 2){
                    keepGoing = false;
                }

            }
            System.out.println("Current total: $" + formatMoney.format(total));
        }

        /*
        *
        *  Loop will be the payment screen.
        *
         */

        while(total > 0){
            machine.outputPaymentScreen();
            userSelection = userInput.nextInt();

            total-= machine.coinValue(machine.weighCoin(userSelection));

            System.out.println("Total: $" + formatMoney.format(total));
        }

    }
}
