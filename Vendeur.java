package tn.tuniprob.gestionemployees;
public class Vendeur extends Employees{
    private int tauxDeVente;
    public Vendeur(int identifiant, String nom, String adresse, float nbr_heures, int tauxDeVente){
        super(identifiant,nom,adresse,nbr_heures);
        this.tauxDeVente=tauxDeVente;
    }
    public int getTauxDeVente() {
        return tauxDeVente;
    }
    public void setTauxDeVente(int tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }
    @Override
    public String toString() {
        return "Vendeur{" +super.toString()+
                "tauxDeVente=" + tauxDeVente +
                "\n salaire:"+calculSalaire()+
                '}';
    }
    @Override
    public double calculSalaire() {
            return (450*(0.1 * getTauxDeVente()));
    }
}
