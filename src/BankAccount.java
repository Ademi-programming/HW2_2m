public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public double withDraw(int sum) throws LimitException {
        amount -= sum;
        if (sum > amount) {
            throw new LimitException("Ошибка. Запрашиваемая сумма больше чем остаток: ",
                     amount);
        }

        return 0;

    }
}
