public class App {
    public static void main(String[] args) {
        char letter = 'L';
        String word = "Lego";

        String message = """
                The word lego have %s in the word %s
                """.formatted(letter, word);
        
        System.out.println(message);
    }
}
