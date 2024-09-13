public class Main {
    public static void main(String[] args) {
        // Fórmula 1: (12 + 8) * (5 - 3) - (6 / 2) / ((3 * 4) + (8 / 2))

        double numerador = (12 + 8) * (5 - 3) - (6.0 / 2);
        double denominador = (3 * 4) + (8.0 / 2);
        double resultado = numerador / denominador;

        System.out.printf("El resultado de la Fórmula 1 es: %.5f%n", resultado);

        //FORMULA 2

        // Numerador
        double parte1 = ((9 * 5) - (15 - 3) + (8 * 2) - (12.0 / 4)) * (7 - 2);
        double parte2 = ((6 * 3) / 2.0);
        double parte3 = (2 + ((3.0 * 2) / (1 - 2)));
        double parte4 = (5 * (6.0 / (2 - 1)));
        double numerador2 = ((parte1 - parte2) / parte3) + parte4 - (6.0 / (2 - 1));

        // Denominador
        double parte5 = (((4 + 2) * (7 - 1)) / (3 + 1));
        double parte6 = ((3 * 2) - (5 + 1)) * (8.0 / 2);
        double parte7 = (3 + (6.0 / (1 + 2)));
        double denominador2 = parte5 + (parte6 / parte7) + (2 * (3 + (8.0 / 4)));

        // Resultado
        double resultado2 = numerador / denominador;

        System.out.printf("El resultado de la Fórmula 2 es: %.5f%n", resultado2);

        //FORMULA 3

        // Numerador
        double numerador3 = ((6 + 4) * 3) - (18.0 / 2);

        // Denominador
        double denominador3 = (8 - 5) + (3 * 2);

        // Resultado
        double resultado3 = numerador3 / denominador3;

        System.out.printf("El resultado de la Fórmula 3 es: %.5f%n", resultado3);



    }

}
