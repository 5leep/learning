import java.text.NumberFormat;

public class formattingNumbers {
    public static void main(String[] args) {
        // 1...
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result1 = currency.format(1234567.891);
        System.out.println(result1);
        // 2...
        NumberFormat percentage = NumberFormat.getPercentInstance();
        String result2 = percentage.format(0.1);
        System.out.println(result2);
        // 3...
        String result3 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result3);
    }
}



