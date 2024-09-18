public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalAPagar = 0;

        // Producto 1
        System.out.println("Ingresa el nombre del producto 1: ");
        String nombreProducto1 = scanner.nextLine();
        System.out.println("Ingresa la cantidad de productos: ");
        int cantidadProducto1 = scanner.nextInt();
        System.out.println("Ingresa el precio unitario del producto: ");
        double precioProducto1 = scanner.nextDouble();
        System.out.println("Ingresa el porcentaje de descuento: ");
        double descuentoProducto1 = scanner.nextDouble();
        System.out.println("Ingresa los impuestos aplicables en porcentaje: ");
        double impuestosProducto1 = scanner.nextDouble();

        double totalSinDescuento1 = cantidadProducto1 * precioProducto1;
        double descuentoAplicado1 = totalSinDescuento1 * (descuentoProducto1 / 100);
        double precioConDescuento1 = totalSinDescuento1 - descuentoAplicado1;
        double impuestosAplicados1 = precioConDescuento1 * (impuestosProducto1 / 100);
        double totalProducto1 = precioConDescuento1 + impuestosAplicados1;

        System.out.println("Resumen del pedido:");
        System.out.println("Producto 1: " + nombreProducto1);
        System.out.println("Cantidad: " + cantidadProducto1);
        System.out.printf("Precio total sin descuento: %.2f%n", totalSinDescuento1);
        System.out.printf("Descuento aplicado: %.2f%n", descuentoAplicado1);
        System.out.printf("Precio con descuento: %.2f%n", precioConDescuento1);
        System.out.printf("Impuestos aplicados: %.2f%n", impuestosAplicados1);
        System.out.printf("Total a pagar: %.2f%n%n", totalProducto1);

        totalAPagar += totalProducto1;

        scanner.nextLine(); // Limpiar el buffer

        // Producto 2
        System.out.println("Ingresa el nombre del producto 2: ");
        String nombreProducto2 = scanner.nextLine();
        System.out.println("Ingresa la cantidad de productos: ");
        int cantidadProducto2 = scanner.nextInt();
        System.out.println("Ingresa el precio unitario del producto: ");
        double precioProducto2 = scanner.nextDouble();
        System.out.println("Ingresa el porcentaje de descuento: ");
        double descuentoProducto2 = scanner.nextDouble();
        System.out.println("Ingresa los impuestos aplicables en porcentaje: ");
        double impuestosProducto2 = scanner.nextDouble();

        double totalSinDescuento2 = cantidadProducto2 * precioProducto2;
        double descuentoAplicado2 = totalSinDescuento2 * (descuentoProducto2 / 100);
        double precioConDescuento2 = totalSinDescuento2 - descuentoAplicado2;
        double impuestosAplicados2 = precioConDescuento2 * (impuestosProducto2 / 100);
        double totalProducto2 = precioConDescuento2 + impuestosAplicados2;

        System.out.println("Producto 2: " + nombreProducto2);
        System.out.println("Cantidad: " + cantidadProducto2);
        System.out.printf("Precio total sin descuento: %.2f%n", totalSinDescuento2);
        System.out.printf("Descuento aplicado: %.2f%n", descuentoAplicado2);
        System.out.printf("Precio con descuento: %.2f%n", precioConDescuento2);
        System.out.printf("Impuestos aplicados: %.2f%n", impuestosAplicados2);
        System.out.printf("Total a pagar: %.2f%n%n", totalProducto2);

        totalAPagar += totalProducto2;

        scanner.nextLine(); // Limpiar el buffer

        // Producto 3
        System.out.println("Ingresa el nombre del producto 3: ");
        String nombreProducto3 = scanner.nextLine();
        System.out.println("Ingresa la cantidad de productos: ");
        int cantidadProducto3 = scanner.nextInt();
        System.out
    }
}
