public class Main {
    public static void main(String[] args) {

        BankAccount client = new BankAccount();
        client.deposit(15000);

        while (true) {

            try {
                System.out.println("Снято " + client.withDraw(6000) + " сом.");
            } catch (LimitException e) {
                System.out.println("Недостаточно средств для снятия 6000 сом. " +
                        "Остаток на счете: " + client.getAmount() + " сом.");
                double remaining = client.getAmount();
                System.out.println("Снято " + remaining + " сом.");
                try {
                    client.withDraw((int) remaining);
                } catch (LimitException ex) {
                    break;
                }
            }
        }
    }
}