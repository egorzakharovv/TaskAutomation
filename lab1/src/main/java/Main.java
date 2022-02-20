import java.awt.*;

public class Main {
    public static void main(String[] args) {
        var bank = new Account("Банк");
        var a1 = new Account("Деньги");
        var a2 = new Account("Товары");

        // Займ 1000р
        bank.creditOperations.add(new CreditOperation(1000, 0, "Занимаем 1000р"));
        a1.debitOperations.add(new DebitOperation(1000, 0, "Занимаем 1000р"));
        // Закупка товарами
        a2.debitOperations.add(new DebitOperation(100, 10, "10 Товаров по 100р"));
        a1.creditOperations.add(new CreditOperation(100, 10, "10 Товаров по 100р"));
        // Продажа товаров
        a2.creditOperations.add(new CreditOperation(100, 10, "10 Товаров купленных по 100р"));
        a1.debitOperations.add(new DebitOperation(150, 10, "10 Товаров купленных по 100р, продаем по 150"));

        System.out.println("Выручка " + a1.getMoney());
        // Отдаем банку 1000р
        a1.creditOperations.add(new CreditOperation(1000, 0, "Отдаем банку 1000р"));
        bank.debitOperations.add(new DebitOperation(1000, 0, "Отдаем банку 1000р"));
        System.out.println("Прибыль " + a1.getMoney());
        System.out.println("Долг: " + bank.getMoney());
    }
}
