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
        assertEquals(5.67, vendingMachine.WeighCoin(1));
    }

}
