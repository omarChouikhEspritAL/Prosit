package tn.tuniprob.gestionemployees;
public class Caissier extends Employees{
    private int numeroDeCaisse;
    public Caissier(int identifiant, String nom, String adresse, float nbr_heures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }
    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }
    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }
    @Override
    public String toString() {
        return "Caissier{" +super.toString()+
                "numeroDeCaisse=" + numeroDeCaisse +
                "\n salaire:"+calculSalaire()+
                '}';
    }
    @Override
    public double calculSalaire() {
        if (getNbr_heures()>=180) {
            return getNbr_heures()*(5+(5*0.15));
        }
        return (getNbr_heures()*5);
    }
}
