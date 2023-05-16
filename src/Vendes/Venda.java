package Vendes;

import java.util.ArrayList;
import java.util.List;


public class Venda {
    private double preuTotal;
    private List<Producte> productes;

    public Venda(){
        productes = new ArrayList<>();
        preuTotal = 0.0;
    }

    public void afegirProducte(Producte producte){
        productes.add(producte);
        preuTotal += producte.getPreu();
    }

    public void eliminarProducte(Producte producte){
        productes.remove(producte);
        preuTotal -= producte.getPreu();
    }

    public void calcularTotal() throws VendaBuidaException {
        if (productes.isEmpty()) {
            throw new VendaBuidaException();
        }
        preuTotal = 0.0;
        for (Producte producte : productes) {
            preuTotal += producte.getPreu();
        }
    }
    public double getPreuTotal() {
        return preuTotal;
    }
}
