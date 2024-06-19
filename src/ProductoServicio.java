import java.util.ArrayList;
import java.util.Scanner;
public class ProductoServicio {

    ArrayList<Producto>listaProductos = new ArrayList<>();
    private Scanner scanner;

    public ProductoServicio() {
        this.listaProductos = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void listarProductos(){
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }

    public void agregarProducto() {

        System.out.println("----- AGREGAR PRODUCTO -----");

        System.out.print("Ingrese nombre del artículo: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese precio: ");
        String precio = scanner.nextLine();

        System.out.print("Ingrese descripción: ");
        String descripcion = scanner.nextLine();

        System.out.print("Ingrese código: ");
        String codigo = scanner.nextLine();

        System.out.print("Ingrese talla: ");
        String talla = scanner.nextLine();

        System.out.print("Ingrese marca: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese color: ");
        String color = scanner.nextLine();

        Producto producto = new Producto(nombre, precio, descripcion, codigo, talla, marca, color);
        listaProductos.add(producto);

        System.out.println("Producto agregado correctamente.");
    }
}

