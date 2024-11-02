public class Task9 {
    public static void main(String[] args) {
        int amountSaving = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100 * 12;
            total = total + amountSaving;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

    }
}
