/**
 * Created by Chase Struse on 10/12/17.
 * Email: chasestruse@gmail.com
 */
public class VendingMachine {

    //Used in machine quantity
    private int _colaQuantity = 5, _chipQuantity = 5, _candyQuantity = 5;
    private int pennies = 0;

    public double weighCoin(int coinChoice) {
        //Returns weight of Quarter
        if(coinChoice == 1){
            return(5.67);
        }
        //Returns weight of dime
        else if(coinChoice == 2){
            return (2.268);
        }
        //Returns weight of Nickel
        else if(coinChoice == 3){
            return (5);
        }
        //Returns weight of Penny
        else if(coinChoice == 4){
            pennies++;
            return (.088);
        }
        else{
            return (0);
        }

    }

    public double coinValue(double coinWeight) {
        if(coinWeight == 5.67){
            return(.25);
        }
        else if(coinWeight == 2.268){
            return(.10);
        }
        else if(coinWeight == 5){
            return(.05);
        }
        else{
            return(0);
        }
    }

    public String dispenseItems(int colasWanted, int chipsWanted, int candyWanted) {
        if(colasWanted >= 1) {
            if(chipsWanted >= 1){
                if(candyWanted >= 1){
                    return ("Cola: " + colasWanted + " Chips: " + chipsWanted + " Candy: " + candyWanted);
                }
                else{
                    return ("Cola: " + colasWanted + " Chips: " + chipsWanted);
                }
            }
            else if(candyWanted >= 1){
                return("Cola: " + colasWanted + " Candy: " + candyWanted);
            }
            else {
                return ("Cola: " + colasWanted);
            }
        }
        else if(chipsWanted >= 1){
            if(candyWanted >= 1){
                return("Chips: " + chipsWanted + " Candy: " + candyWanted);
            }
            else {
                return ("Chips: " + chipsWanted);
            }
        }
        else{
            return("Candy: " + candyWanted);
        }
    }

    public String returnChange(double totalChange) {
        int _quarters = 0, _dimes = 0, _nickels = 0;

        while(totalChange > 0) {

            if (totalChange >= .25) {
                _quarters++;
                totalChange -= .25;
            }
            else if (totalChange >= .1 && totalChange < .25) {
                _dimes++;
                totalChange -= .10;
            }
            else if (totalChange >= .05 && totalChange < .10) {
                _nickels++;
                totalChange -= .05;
            }
            else {
                break;
            }

            //Odd error when subtracting doubles so this rounds
            if(totalChange < .1 && totalChange > .09){
                totalChange=.1;
            }
            else if(totalChange <.05 && totalChange >.04){
                totalChange=.05;
            }
        }

        if (_quarters >= 1) {
            if(_dimes >= 1){
                if(_nickels >= 1){
                    if(pennies >= 1){
                        return ("Quarters: " + _quarters + " Dimes: " + _dimes + " Nickels: " + _nickels + " Pennies: " + pennies);
                    }
                    else {
                        return ("Quarters: " + _quarters + " Dimes: " + _dimes + " Nickels: " + _nickels);
                    }
                }
                else if(_dimes >= 1 && pennies == 0){
                    return ("Quarters: " + _quarters + " Dimes: " + _dimes);
                }
                else{
                    return("Quarters: " + _quarters + " Pennies: " + pennies);
                }
            }
            else if(_nickels >= 1){
                return("Quarters: " + _quarters + " Nickels: " + _nickels);
            }
            else {
                return ("Quarters: " + _quarters);
            }

        }
        else if (_dimes >= 1) {
            if(pennies >=1){
                return ("Dimes: " + _dimes + "Pennies: " +pennies);
            }
            else {
                return ("Dimes: " + _dimes);
            }
        }
        else {
            if(pennies >= 1){
                return ("Nickels: " + _nickels + " Pennies: " + pennies);
            }
            else {
                return ("Nickels: " + _nickels);
            }
        }

    }

    public boolean machineQuantity(int quantityWanted, String productWanted) {

        if(productWanted.equalsIgnoreCase("Cola")){
            if(_colaQuantity - quantityWanted >= 0) {
                return true;
            }
            else{
                return false;
            }
        }
        else if(productWanted.equalsIgnoreCase("Chips")){
            if(_chipQuantity - quantityWanted >= 0) {
                return true;
            }
            else{
                return false;
            }
        }
        else if(productWanted.equalsIgnoreCase("Candy")){
            if(_candyQuantity - quantityWanted >= 0) {
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }

    }

    public void outputSelectionScreen(){
        System.out.println("Please enter your selection below");
        System.out.println("Enter 1 for a Cola");
        System.out.println("Enter 2 for chips");
        System.out.println("Enter 3 for candy");

    }

    public void outputPaymentScreen(){
        System.out.println("Please enter your selection below");
        System.out.println("Enter 1 to insert a quarter");
        System.out.println("Enter 2 to insert a dime");
        System.out.println("Enter 3 to insert a nickel");
        System.out.println("Enter 4 to insert a pennie");
    }
}
