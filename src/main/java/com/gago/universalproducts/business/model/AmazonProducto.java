package com.gago.universalproducts.business.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="AMAZONPRODUCTOS")
public class AmazonProducto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String asin; // Numero unico de referencia de todos los  productos de Amazon
    private String Titulo;
    private double precio;
    private String descripcion;
    private String categoria;
    private double valoracion;
    private int nValoraciones;
    private String marca;
    private String modelo;
    private String url;
    private String imagen;
    private Date fechaAlta;
    private int seguidores;
    private String usuarioIdAlta;

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public int getnValoraciones() {
        return nValoraciones;
    }

    public void setnValoraciones(int nValoraciones) {
        this.nValoraciones = nValoraciones;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public String getUsuarioIdAlta() {
        return usuarioIdAlta;
    }

    public void setUsuarioIdAlta(String usuarioIdAlta) {
        this.usuarioIdAlta = usuarioIdAlta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AmazonProducto that = (AmazonProducto) o;
        return asin.equals(that.asin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asin);
    }

    @Override
    public String toString() {
        return "AmazonProducto{" +
                "asin='" + asin + '\'' +
                ", Titulo='" + Titulo + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", categoria='" + categoria + '\'' +
                ", valoracion=" + valoracion +
                ", nValoraciones=" + nValoraciones +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", url='" + url + '\'' +
                ", imagen='" + imagen + '\'' +
                ", fechaAlta=" + fechaAlta +
                ", seguidores=" + seguidores +
                ", usuarioIdAlta='" + usuarioIdAlta + '\'' +
                '}';
    }
}


