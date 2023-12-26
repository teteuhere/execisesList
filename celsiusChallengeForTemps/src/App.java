public class App {
    public static void main(String[] args) {
    
        int celsius = 41;
        double fahrenheit = (((celsius) * 1.8) + 32);
        double kelvin = (celsius + 273.15);
        String mensagem = """
                Temperaturas
                    A temperatura em celsius é %d.
                    A temperatura em fahrenheit é %.2f.
                    A temperatura fahrenheit em inteiro é %.0f.
                    A temperatura em kelvin é %.2f.
                    A temperatura kelvin em inteiro é %.0f.
                    """.formatted(celsius, fahrenheit, fahrenheit, kelvin, kelvin);
        System.out.println(mensagem);
    }
}
