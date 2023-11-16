package Entity;

import Abstract.Auditoria;

public class Producto extends Auditoria {

    private String nombre;
    private Long cantidadEnStock;
    private Double precioDeCompra;
    private Double precioDeVenta;
    private Venta venta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(Long cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    public Double getPrecioDeCompra() {
        return precioDeCompra;
    }

    public void setPrecioDeCompra(Double precioDeCompra) {
        this.precioDeCompra = precioDeCompra;
    }

    public Double getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(Double precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Override
    public void Crear() {
        System.out.println("Agregar producto");
    }

    @Override
    public void Modificar() {
        System.out.println("Modificar producto");
    }

    @Override
    public void Eliminar() {
        System.out.println("Elimianr producto");
    }

    @Override
    public void Consultar() {
        System.out.println("Consultar producto");
    }
}
