/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dennischirinos_lab6;

import java.util.ArrayList;

/**
 *
 * @author denni
 */
public class Baleada {

    int precio;
    ArrayList<String> Ingredientes = new ArrayList();
    String tipo;

    public Baleada(int op) {
        switch (op) {
            case 1:
                Ingredientes.add("Tortilla");
                Ingredientes.add("Mantequilla");
                Ingredientes.add("Frijoles");
                precio = 22;
                tipo = "Binaria";
                break;
            case 2:
                Ingredientes.add("Tortilla");
                Ingredientes.add("Mantequilla");
                Ingredientes.add("Frijoles");
                Ingredientes.add("Huevo");
                tipo = "Especial";
                precio = 35;
                break;
            case 4:
                Ingredientes.add("Tortilla");
                Ingredientes.add("Mantequilla");
                Ingredientes.add("Frijoles");
                Ingredientes.add("Huevo");
                Ingredientes.add("Plátano");
                Ingredientes.add("Chorizo");
                tipo = "OutOfBounds";
                precio = 85;
                break;
            case 3:
                Ingredientes.add("Tortilla");
                Ingredientes.add("Mantequilla");
                Ingredientes.add("Frijoles");
                Ingredientes.add("Huevo");
                Ingredientes.add("Platano");
                precio = 55;
                tipo = "Reloaded";
                break;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<String> getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(ArrayList<String> Ingredientes) {
        this.Ingredientes = Ingredientes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }

}
