public class Main {
    public static void main(String[] args) {
        CreditPaymentService calc = new CreditPaymentService();
        double result = calc.calculate(1000000, 0.0999, 12);
        System.out.println(result);

        result = calc.calculate(1000000, 0.0999, 24);
        System.out.println(result);

        result = calc.calculate(1000000, 0.0999, 36);
        System.out.println(result);
    }
}