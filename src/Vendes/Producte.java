package Vendes;

public class Producte {

    private String nom = " ";
    private double preu = 0.0;

    public Producte(String nom, double preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public double getPreu() {
        return preu;
    }
}
