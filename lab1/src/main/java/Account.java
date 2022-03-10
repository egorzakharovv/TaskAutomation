import java.util.ArrayList;

public class Account {
    String name;
    public ArrayList<DebitOperation> debitOperations = new ArrayList<>();
    public ArrayList<CreditOperation> creditOperations = new ArrayList<>();

    public Account(String name) {
        this.name = name;
    }

    public int getMoney() {
        var debit = 0;
        var credit = 0;

        for (var op : debitOperations)
            debit += op.count();

        for (var op : creditOperations)
            credit += op.count();

        return  debit - credit;
    }
}
