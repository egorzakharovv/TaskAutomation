public class CreditOperation {
    int money;
    int amount;
    String comment;

    public CreditOperation(int money, int amount, String comment) {
        this.money = money;
        this.amount = amount;
        this.comment = comment;
    }

    public int count() {
        if(this.amount == 0) {
            return money;
        }
        else return this.money * this.amount;
    }
}
