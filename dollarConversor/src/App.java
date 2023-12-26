public class App {
    public static void main(String[] args) {
        double dollar = 4.94;
        double brl = 6;
        double convert = (dollar * brl);

        String message = """
            After the convertion the amount of brazilian(%.2f) and the amount of dollar(%.2f) is equals to "%.2f"
                """.formatted(brl, dollar, convert);
        
        System.out.println(message);
    }
}
