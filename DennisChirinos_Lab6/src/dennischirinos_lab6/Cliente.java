/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dennischirinos_lab6;

/**
 *
 * @author denni
 */
public class Cliente {

    String Nombre;
    int Número;
    double Efectivo;
    String Direccion;
    Orden orden;

    public Cliente(String Nombre, int Número, double Efectivo, String Direccion) {
        this.Nombre = Nombre;
        this.Número = Número;
        this.Efectivo = Efectivo;
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNúmero() {
        return Número;
    }

    public void setNúmero(int Número) {
        this.Número = Número;
    }

    public double getEfectivo() {
        return Efectivo;
    }

    public void setEfectivo(double Efectivo) {
        this.Efectivo = Efectivo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return Nombre;
    }

}
