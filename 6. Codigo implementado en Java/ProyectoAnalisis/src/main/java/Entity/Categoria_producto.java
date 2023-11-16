package Entity;

import Abstract.Auditoria;

public class Categoria_producto extends Auditoria {

    private String nombre;
    private String descripcion;
    private Producto producto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public void Crear() {
        System.out.println("Agregar Categoria del producto");
    }

    @Override
    public void Modificar() {
        System.out.println("Modificar Categoria del producto");
    }

    @Override
    public void Eliminar() {
        System.out.println("Eliminar Categoria del producto");
    }

    @Override
    public void Consultar() {
        System.out.println("Consultar Categoria del producto");
    }
}
