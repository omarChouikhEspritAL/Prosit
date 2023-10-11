package tn.tuniprob.gestionmagasin.produit;


import java.util.Date;

public class Produit {
    private int identifiant;
    private String libellé;
    private String marque;
    private double prix;
    private Date dateExpiration;
    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibellé() {
        return libellé;
    }

    public void setLibellé(String libellé) {
        this.libellé = libellé;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if(prix>0){
            this.prix = prix;
        } else System.out.println("prix doit etre positif");
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Produit(){}

    public Produit(int identifiant, String libellé) {
        this.identifiant = identifiant;
        this.libellé=libellé;
    }



    public void afficher(){
        System.out.println("identifiant : "+ identifiant+"\n libellé : "+libellé+"\n marque : "+marque+"\n prix : "+prix+"\n date expiration : "+dateExpiration);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "identifiant=" + identifiant +
                ", libellé='" + libellé +
                ", marque='" + marque +
                ", prix=" + prix +
                ", dateExpiration=" + dateExpiration +
                '}';
    }

    public boolean comparer(Produit produit){
            if (produit.getIdentifiant() == this.getIdentifiant() &&
                    produit.getLibellé().equals(this.getLibellé()) &&
                    produit.getPrix() == this.getPrix()) {
                return true;
            }
        return false;
    }

    public static boolean comparer(Produit produit1,Produit produit2){
        if (produit1.getLibellé().equals(produit2.getLibellé())&& produit1.getIdentifiant()==produit2.getIdentifiant()&&produit1.getPrix()==produit2.getPrix()){
            return true;
        } else return false;
    }
}
