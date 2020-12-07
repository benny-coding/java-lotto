package autolotto;

import autolotto.model.Buyer;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class BuyerTest {

    @Test
    @DisplayName("돈을 가진 구매자가 잘 만들어 지는가")
    public void createBuyer(){
        Buyer buyer = new Buyer(10000);
        buyer.buyLottos();
        assertEquals(buyer.getLottos().getLottosCount(),10);
    }
}
