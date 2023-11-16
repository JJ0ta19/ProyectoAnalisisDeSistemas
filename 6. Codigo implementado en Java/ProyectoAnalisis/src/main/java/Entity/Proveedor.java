package Entity;

import Abstract.Auditoria;

import java.util.List;

public class Proveedor extends Auditoria {

    private String nombre;
    private String direccion;
    private String numeroTelefono;
    private String correo;
    private List<Producto> productosQueVende;
    private List<Double> preciosDeCompra;
    private List<String> condicionesDePago;
    private Producto producto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Producto> getProductosQueVende() {
        return productosQueVende;
    }

    public void setProductosQueVende(List<Producto> productosQueVende) {
        this.productosQueVende = productosQueVende;
    }

    public List<Double> getPreciosDeCompra() {
        return preciosDeCompra;
    }

    public void setPreciosDeCompra(List<Double> preciosDeCompra) {
        this.preciosDeCompra = preciosDeCompra;
    }

    public List<String> getCondicionesDePago() {
        return condicionesDePago;
    }

    public void setCondicionesDePago(List<String> condicionesDePago) {
        this.condicionesDePago = condicionesDePago;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public void Crear() {
        System.out.println("Agregar proveedor");
    }

    @Override
    public void Modificar() {
        System.out.println("Modificar proveedor");
    }

    @Override
    public void Eliminar() {
        System.out.println("Elimianr proveedor");
    }

    @Override
    public void Consultar() {
        System.out.println("Consultar proveedor");
    }
}
