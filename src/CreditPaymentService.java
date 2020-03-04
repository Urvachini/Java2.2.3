public class CreditPaymentService {
    public double calculate(int Credit, double Interest, int Month) {
        double MonthInterest = Interest / 12;
        double MonthlyPay = Credit * (MonthInterest * Math.pow((1 + MonthInterest), Month)) / (Math.pow(1 + MonthInterest, Month) - 1);
        MonthlyPay = Math.round(MonthlyPay);
        return MonthlyPay;
    }
}
