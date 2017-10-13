import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Chase Struse on 10/12/17.
 * Email: chasestruse@gmail.com
 */
public class VendingMachineTest {

    VendingMachine vendingMachine = new VendingMachine();

    @Test
    public void testWhenWeighCoinIsPassedAIntItReturnsTheCorrectCoinWeight(){
        //For Quarters
        assertEquals(5.67, vendingMachine.weighCoin(1));
        //For Dimes
        assertEquals(2.268, vendingMachine.weighCoin(2));
        //For Nickels
        assertEquals(5.0, vendingMachine.weighCoin(3));
        //For Pennies
        assertEquals(.088, vendingMachine.weighCoin(4));
    }

    @Test
    public void testWhenCoinValueIsPassedTheWeightOfACoinItReturnsTheValueOfThatCoin(){
        //For Quarters
        assertEquals(.25, vendingMachine.coinValue(vendingMachine.weighCoin(1)));
        //For Dimes
        assertEquals(.10, vendingMachine.coinValue(vendingMachine.weighCoin(2)));
        //For Nickels
        assertEquals(.05, vendingMachine.coinValue(vendingMachine.weighCoin(3)));
        //For Pennies
        assertEquals(0, vendingMachine.coinValue(vendingMachine.weighCoin(4)));
    }

    @Test
    public void testWhenDispenseItemsIsPassedCertainItemsItReturnsTheCorrectString(){
        //1 Cola 0 Chips 0 Candy
        assertEquals("Cola: 1", vendingMachine.dispenseItems(1,0,0));
        //0 Cola 1 Chips 0 Candy
        assertEquals( "Chips: 1", vendingMachine.dispenseItems(0,1,0));
        //0 Cola 0 Chips 1 Candy
        assertEquals("Candy: 1", vendingMachine.dispenseItems(0,0,1));

        //1 Cola 1 Chips 0 Candy
        assertEquals("Cola: 1 Chips: 1", vendingMachine.dispenseItems(1,1,0));
        //1 Cola 0 Chips 1 Candy
        assertEquals("Cola: 1 Candy: 1", vendingMachine.dispenseItems(1,0,1));
        //1 Cola 1 Chips 1 Candy
        assertEquals("Cola: 1 Chips: 1 Candy: 1", vendingMachine.dispenseItems(1,1,1));

        //0 Cola 1 Chips 1 Candy
        assertEquals("Chips: 1 Candy: 1", vendingMachine.dispenseItems(0,1,1));
    }

    @Test
    public void testWhenReturnChangeIsPassedADoubleItSplitsItIntoTheRightAmountOfChange(){
        //Tests it returns quarters
        assertEquals("Quarters: 1", vendingMachine.returnChange(.25));


    }


}
