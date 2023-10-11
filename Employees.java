package tn.tuniprob.gestionemployees;
public abstract class Employees {
    private int identifiant;
    private String nom;
    private String adresse;
    private float nbr_heures;
    public Employees(int identifiant, String nom, String adresse, float nbr_heures) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }
    public int getIdentifiant() {
        return identifiant;
    }
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public float getNbr_heures() {
        return nbr_heures;
    }
    public void setNbr_heures(float nbr_heures) {
        this.nbr_heures = nbr_heures;
    }
    @Override
    public String toString() {
        return "identifiant=" + identifiant +
                ", nom='" + nom +
                ", adresse='" + adresse +
                ", nbr_heures=" + nbr_heures;
    }
    public abstract double calculSalaire();

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employe = (Employees) o;
        return identifiant == employe.identifiant && nom.equals(employe.nom);
    }
}
