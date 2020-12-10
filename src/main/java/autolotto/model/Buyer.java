package autolotto.model;

public class Buyer {
    private final Money money;
    private Lottos lottos;

    public Buyer(int money) {
        this.money = new Money(money);
    }

    public void buyLottos() {
        lottos = new Lottos(money);
    }

    public Lottos getLottos() {
        return lottos;
    }
}
