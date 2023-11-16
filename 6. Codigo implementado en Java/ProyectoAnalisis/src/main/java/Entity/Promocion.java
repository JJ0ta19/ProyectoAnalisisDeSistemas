package Entity;

import Abstract.Auditoria;

import java.util.Date;

public class Promocion extends Auditoria {

    private String nombre;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
    private Double descuento;
    private String cupon;
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public String getCupon() {
        return cupon;
    }

    public void setCupon(String cupon) {
        this.cupon = cupon;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public void Crear() {
        System.out.println("Agregar promoción");
    }

    @Override
    public void Modificar() {
        System.out.println("Modificar promoción");
    }

    @Override
    public void Eliminar() {
        System.out.println("Elimianr promoción");
    }

    @Override
    public void Consultar() {
        System.out.println("Consultar promoción");
    }
}
