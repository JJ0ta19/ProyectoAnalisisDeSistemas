package Entity;

import Abstract.Auditoria;

import java.util.Date;
import java.util.List;

public class Factura extends Auditoria {

    private Date fecha;
    private Long numeroFactura;
    private List<Producto> productosVendidos;
    private List<Long> cantidadProductos;
    private List<Double> preciosUnitarios;
    private List<Double> precioTotal;
    private Venta venta;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(Long numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public List<Producto> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(List<Producto> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public List<Long> getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(List<Long> cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public List<Double> getPreciosUnitarios() {
        return preciosUnitarios;
    }

    public void setPreciosUnitarios(List<Double> preciosUnitarios) {
        this.preciosUnitarios = preciosUnitarios;
    }

    public List<Double> getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(List<Double> precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Override
    public void Crear() {
        System.out.println("Agregar factura");
    }

    @Override
    public void Modificar() {
        System.out.println("Modificar factura");
    }

    @Override
    public void Eliminar() {
        System.out.println("Eliminar factura");
    }

    @Override
    public void Consultar() {
        System.out.println("Consultar factura");
    }
}
