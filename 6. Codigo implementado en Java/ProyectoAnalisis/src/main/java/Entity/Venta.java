package Entity;

import Abstract.Auditoria;

import java.util.Date;

public class Venta extends Auditoria {

    private Date fecha;
    private Long numeroFactura;
    private String nombreProducto;
    private Long cantidadVendida;
    private Double precioUnitario;
    private Empleado empleado;

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

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

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Long getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(Long cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }


    @Override
    public void Crear() {
        System.out.println("Agregar venta");
    }

    @Override
    public void Modificar() {
        System.out.println("Modificar venta");
    }

    @Override
    public void Eliminar() {
        System.out.println("Elimianr venta");
    }

    @Override
    public void Consultar() {
        System.out.println("Consultar venta");
    }
}
