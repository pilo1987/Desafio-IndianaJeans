import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private ProductoServicio productoServicio;
    private ExportadorTxt exportadorTxt;
    public Menu() {
        this.scanner = new Scanner(System.in);
        this.productoServicio = new ProductoServicio();
        this.exportadorTxt = new ExportadorTxt("src/Indiana-Jeans.txt");

    }

    public void mostrarMenu() {
        int opcion = 0;

        do {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Listar Producto");
            System.out.println("2. Agregar Producto");
            System.out.println("3. Exportar Datos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Listando productos por favor espere . . . ");
                    Utilidad.tiempoEspera(2000);
                    break;

                case 2:
                    productoServicio.agregarProducto();
                    Utilidad.tiempoEspera(2000);
                    break;

                case 3:
                    exportarProductos();
                    Utilidad.tiempoEspera(2000);
                    break;

                case 4:
                    System.out.println("Saliendo del programa por favor espere . . . ");
                    Utilidad.tiempoEspera(2000);
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida (1-4).");
                    Utilidad.tiempoEspera(2000);
                    break;
            }

        } while (opcion != 4);

        scanner.close();
    }

    private void exportarProductos() {
        exportadorTxt.exportar(productoServicio.getListaProductos());
    }
}

