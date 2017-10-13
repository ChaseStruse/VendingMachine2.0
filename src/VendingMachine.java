/**
 * Created by Chase Struse on 10/12/17.
 * Email: chasestruse@gmail.com
 */
public class VendingMachine {

    public double WeighCoin(int coinChoice) {

        if(coinChoice == 1){
            return(5.67);
        }
        else if(coinChoice == 2){
            return (2.268);
        }
        else if(coinChoice == 3){
            return (5);
        }
        else{
            return (0);
        }

    }
}
