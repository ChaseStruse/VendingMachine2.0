/**
 * Created by Chase Struse on 10/12/17.
 * Email: chasestruse@gmail.com
 */
public class VendingMachine {

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
            return ("Cola: " + colasWanted);
        }
        else if(chipsWanted >= 1){
            return("Chips: " + chipsWanted);
        }
        else{
            return("Candy: " + candyWanted);
        }
    }
}
