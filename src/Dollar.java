class Dollar extends Money {
    Dollar(int amount) {
        this.amount = amount;
        currency = "USD";
    }

    Money times(int multiplier)  {
        return Money.dollar(amount * multiplier);
    }
}