/**
 * Created by Chase Struse on 10/12/17.
 * Email: chasestruse@gmail.com
 */
public class VendingMachine {

    public double WeighCoin(int coinChoice) {
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
}
