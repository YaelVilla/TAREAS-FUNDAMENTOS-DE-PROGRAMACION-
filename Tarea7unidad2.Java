public class Main {
    private static double NumeroRandom;

    public static void main(String[] args) {
        double numeroRandom1 = Math.random() * 100;
        System.out.println(numeroRandom1);
        double numeroRandom2 = Math.random() * 100;
        System.out.println(numeroRandom2);
        double numeroRandom3 = Math.random() * 100;
        System.out.println(numeroRandom3);
        double numeroRandom4 = Math.random() * 100;
        System.out.println(numeroRandom4);
        double numeroRandom5 = Math.random() * 100;
        System.out.println(numeroRandom5);
        double numeroRandom6 = Math.random() * 100;
        System.out.println(numeroRandom6);
        double numeroRandom7 = Math.random() * 100;
        System.out.println(numeroRandom7);
        double numeroRandom8 = Math.random() * 100;
        System.out.println(numeroRandom8);
        double numeroRandom9 = Math.random() * 100;
        System.out.println(numeroRandom9);
        double numeroRandom10 = Math.random() * 100;
        System.out.println(numeroRandom10);

        double numero = numeroRandom1;
        double raizCuadrada = Math.sqrt(numero);
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);

        double numero2 = numeroRandom2;
        double raizCuadrada2 = Math.sqrt(numero2);
        System.out.println("La raíz cuadrada de " + numero2 + " es: " + raizCuadrada2);

        double numero3 = numeroRandom3;
        double raizCuadrada3 = Math.sqrt(numero3);
        System.out.println("La raiz cuadrada de " + numero3 + " es: " + raizCuadrada3);

        double numero4 = numeroRandom4;
        double raizCuadrada42 = Math.sqrt(numero4);
        System.out.println("La raiz cuadrada de " + numero4 + " es: " + raizCuadrada42);

        double numero5 = numeroRandom5;
        double raizCuadrada5 = Math.sqrt(numero5);
        System.out.println("La raiz cuadrada de " + numero5 + " es: " + raizCuadrada5);

        double numero6 = numeroRandom6;
        double raizCuadrada6 = Math.sqrt(numero6);
        System.out.println("La raiz cuadrada de " + numero6 + " es: " + raizCuadrada6);

        double numero7 = numeroRandom7;
        double raizCuadrada7 = Math.sqrt(numero7);
        System.out.println("La raiz cuadrada de " + numero7 + " es: " + raizCuadrada7);

        double numero8 = numeroRandom8;
        double raizCuadrada8 = Math.sqrt(numero8);
        System.out.println("La raiz cuadrada de " + numero8 + " es: " + raizCuadrada8);

        double numero9 = numeroRandom9;
        double raizCuadrada9 = Math.sqrt(numero9);
        System.out.println("La raiz cuadrada de " + numero9 + " es: " + raizCuadrada9);

        double numero10 = numeroRandom10;
        double raizCuadrada10 = Math.sqrt(numero10);
        System.out.println("La raiz cuadrada de " + numero10 + " es: " + raizCuadrada10);

        double numeroelevado = numeroRandom1;
        double numerocuadrado1 = Math. pow(numeroelevado, 2);
        System.out.println("El numero elevado al cuadrado es: " + numeroelevado);

        double numeroelevado1 = numeroRandom2;
        double numerocuadrado2 = Math. pow(numeroelevado, 2);
        System.out.println("El numero elevado al cuadrado es: " + numeroelevado);

        double numeroelevado2 = numeroRandom3;
        double numerocuadrado3 = Math. pow(numeroelevado2, 2);
        System.out.println("El numero elevado al cuadrado es: " + numeroelevado2);

        double numeroelevado4 = numeroRandom4;
        double numerocuadrado4 = Math. pow(numeroelevado4, 2);
        System.out.println("El numero elevado al cuadrado es: " + numeroelevado4);

        double numeroelevado5 = numeroRandom5;
        double numerocuadrado5 = Math. pow(numeroelevado5, 2);
        System.out.println("El numero elevado al cuadrado es: " + numeroelevado5);

        double numeroelevado6 = numeroRandom6;
        double numerocuadrado6 = Math. pow(numeroelevado6, 2);
        System.out.println("El numero elevado al cuadrado es: " + numeroelevado6);

        double numeroelevado7 = numeroRandom7;
        double numerocuadrado7 = Math. pow(numeroelevado7, 2);
        System.out.println("El numero elevado al cuadrado es: " + numeroelevado7);

        double numeroelevado8 = numeroRandom8;
        double numerocuadrado8 = Math. pow(numeroelevado8, 2);
        System.out.println("El numero elevado al cuadrado es: " + numeroelevado8);

        double numeroelevado9 = numeroRandom9;
        double numerocuadrado9 = Math.pow(numeroelevado9, 2);
        System.out.println("El numero elevado al cuadrado es: " + numeroelevado9);

        double numeroelevado10 = numeroRandom10;
        double numerocuadrado10 = Math.pow(numeroelevado10, 2);
        System.out.println("El numero elevado al cuadrado es: " + numeroelevado10);


        // Calcular la media correctamente
        double suma = numeroRandom1 + numeroRandom2 + numeroRandom3 + numeroRandom4 + numeroRandom5 +
                numeroRandom6 + numeroRandom7 + numeroRandom8 + numeroRandom9 + numeroRandom10;
        double media = suma / 10;
        System.out.println("La media es: " + media);


        // Calcular la desviación estándar
        double sumaDiferenciasCuadradas = Math.pow(numeroRandom1 - media, 2) + Math.pow(numeroRandom2 - media, 2) +
                Math.pow(numeroRandom3 - media, 2) + Math.pow(numeroRandom4 - media, 2) +
                Math.pow(numeroRandom5 - media, 2) + Math.pow(numeroRandom6 - media, 2) +
                Math.pow(numeroRandom7 - media, 2) + Math.pow(numeroRandom8 - media, 2) +
                Math.pow(numeroRandom9 - media, 2) + Math.pow(numeroRandom10 - media, 2);

        double desviacionEstandar = Math.sqrt(sumaDiferenciasCuadradas / 10);
        System.out.println("La desviación estándar es: " + desviacionEstandar);








    }
}
