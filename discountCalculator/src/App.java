public class App {
    public static void main(String[] args) {
        double price = 449.49;
        double discount = 10.0;
        double discounted = ((discount/100)* price);
        double finalPrice = price - discounted;

        String message = """
            The initial price is %.2f.
            The discont is %.2f.
            The discounted is %.2f.
            the final price is %.2f.
        """.formatted(price, discount,discounted, finalPrice);

        System.out.println(message);
    }
}
