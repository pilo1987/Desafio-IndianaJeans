import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportadorTxt extends Exportador{
    private String nombreArchivo;

    public ExportadorTxt(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void exportar() {

    }

    @Override
    public void exportar(ArrayList<Producto> listaProductos) {

        try (FileWriter writer = new FileWriter(this.nombreArchivo)) {
            for (Producto producto : listaProductos) {
                writer.write("" + producto.getArticulo() + '\t' );
                writer.write("" + producto.getPrecio() + '\t');
                writer.write("" + producto.getDescripcion() + '\t');
                writer.write("" + producto.getCodigo() + '\t');
                writer.write("" + producto.getTalla() + '\t');
                writer.write("" + producto.getMarca() + '\t');
                writer.write("" + producto.getColor() + '\t');
            }
            System.out.println("Exportación completada en " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al exportar los productos: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
