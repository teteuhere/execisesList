public class App {
    public static void main(String[] args) {
        double product = 69.99;
        int quantity = 7;
        double resultant = (product*quantity);

        String message = """
            The resultant is equal %.2f.
                """.formatted(resultant);
        
        System.out.println(message);
    }
}
