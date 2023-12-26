public class App {
    public static void main(String[] args) {
        double notaA = 3.5;
        double notaB = 7.8;
        double mediaNotas = (notaA + notaB)/2;

        String media = """
                A primeira nota é %.2f.
                A segunda nota é %.2f.
                A media das notas é %.2f.

                """.formatted(notaA, notaB, mediaNotas);
        System.out.println(media);
        }
}
