package tn.tuniprob.gestionemployees;
public class Responsable extends Employees{
    private float prime;
    public Responsable(int identifiant, String nom, String adresse, float nbr_heures, float prime) {
        super(identifiant, nom, adresse, nbr_heures);
        this.prime = prime;
    }
    public float getPrime() {
        return prime;
    }
    public void setPrime(float prime) {
        this.prime = prime;
    }
    @Override
    public String toString() {
        return "Responsable{" +super.toString()+
                ", prime=" + prime +
                "\n salaire:"+calculSalaire()+
                '}';
    }
    @Override
    public double calculSalaire() {
        if (getNbr_heures()>=160) {
            return ((160*10)+
                    ((getNbr_heures()-160)*(10+(10*0.2)))
                    +getPrime());
        }
        return (getNbr_heures()*10)+getPrime();
    }
}
