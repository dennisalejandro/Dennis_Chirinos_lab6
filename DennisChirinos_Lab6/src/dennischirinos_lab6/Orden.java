/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dennischirinos_lab6;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author denni
 */
public class Orden {
    int Numero;
    Date Fecha;
    ArrayList<Baleada> listBaleadas = new ArrayList();
    boolean Terminada;

    public Orden(int Numero, Date Fecha) {
        this.Numero = Numero;
        this.Fecha = Fecha;
    }

    

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public ArrayList<Baleada> getListBaleadas() {
        return listBaleadas;
    }

    public void setListBaleadas(ArrayList<Baleada> listBaleadas) {
        this.listBaleadas = listBaleadas;
    }
    
}
