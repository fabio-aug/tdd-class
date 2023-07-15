public class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
        currency = "CHF";
    }

    Money times(int multiplier)  {
        return Money.franc(amount * multiplier);
    }
}
