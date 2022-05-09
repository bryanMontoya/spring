package com.platzi.platzimarket.persistence.entity;

//Clase que mapea clase de la bd.
import javax.persistence.*;

@Entity
//Porque se llama diferente en la clase vs la tabla.
@Table(name = "productos")
public class Producto {

    @Id //Clave primaria sencilla.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genere valor de manera automática.
    @Column(name = "id_producto") //Porque se llama diferente en la clase y en la tabl.
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private String idCategoria;

    @Column(name = "codigo_barras" )
    private String codigoBarras;

    @Column(name = "precio_venta")
    private double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
