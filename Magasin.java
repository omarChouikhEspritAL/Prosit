package tn.tuniprob.gestionmagasin.magasin;
import tn.tuniprob.gestionemployees.Caissier;
import tn.tuniprob.gestionemployees.Employees;
import tn.tuniprob.gestionemployees.Responsable;
import tn.tuniprob.gestionemployees.Vendeur;
import tn.tuniprob.gestionmagasin.produit.Produit;
public class Magasin {
    private int identifiant;
    private String nom;
    private String adresse;
    private final int CAPACITE_PR=50;
    private int comp;
    private Produit[] produits= new Produit[50];
    private static int nombreProd;
    private Employees[] emps = new Employees[20];
    public Magasin(){

    }
    public Magasin(int identifiant,String nom, String adresse){
        this.identifiant=identifiant;
        this.adresse=adresse;
        this.nom=nom;
    }
    public static int getNombreProd(){
        return nombreProd;
    }
    public int getIdentifiant() {
        return identifiant;
    }
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public int getcomp() {
        return comp;
    }
    public void setcomp(int comp) {
        this.comp = comp;
    }
    public String AfficheEmps() {
        int i = 0;
        String s="{";
        while (emps[i]!=null){
            s=s+emps[i]+"\n";
            i++;
        }
        return s;
    }
    public void setEmps(Employees employe) {
        int i = 0;
        while (emps[i]!=null){
            i++;
        }
        emps[i]=employe;
    }
    public Produit[] getProduits() {
        return produits;
    }
    public void ajoutprod(Produit produit){
        if(!rechercheProd(produit)){
            if(comp<CAPACITE_PR){
                produits[comp]=produit;
                comp++;
                nombreProd++;
            } else {
                System.out.println("Magasin est plein");
            }
        } else {
            System.out.println("Produit existe deja dans le magasin");
        }
    }
    @Override
    public String toString() {
        String ps="";
        for (int i=0;i<comp;i++){
            ps=ps+("nom: ")+produits[i].getLibellé()+(" prix: ")+produits[i].getPrix()+",\t";
        }
        return "Magasin{" +
                "identifiant=" + identifiant +
                ", adresse='" + adresse +
                ", Capaciter=" + comp +"/"+CAPACITE_PR+
                ", produits=[ " + ps+"]"+
                ", Employees="+AfficheEmps()+
                '}';
    }
    public boolean rechercheProd(Produit produit) {
       for (int i=0;i<comp;i++){
            if (Produit.comparer(produit,produits[i]))
                return true;
        }
        return false;
    }
    public void deleteProdMag(Produit produit) {
        if (rechercheProd(produit)){
            int index = -1;
            for (int i = 0; i < comp; i++) {
                if (rechercheProd(produit)) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                for (int i = index; i < comp - 1; i++) {
                    produits[i] = produits[i + 1];
                }
                comp--;
                nombreProd--;
                System.out.println("Produit "+ produit.getIdentifiant()+" supprimé");
            }
        } else {
            System.out.println("Le produit n'existe pas");
        }
    }
    public static Magasin plusProduit(Magasin magasin1,Magasin magasin2){
        if (magasin1.comp>magasin2.comp){
            return magasin1;
        }else if (magasin1.comp<magasin2.comp){
            return magasin2;
        }
        return null;
    }
    public int search(Produit produit){
        for (int i =0; i<comp;i++){
            if (produit.comparer(produits[i])) {
                return i;
            }
        }
        return -1;
    }
    public void afficheSalaireEmps(){
        int i=0;
        for (Employees e:emps) {
            if (e==null){
                break;
            }
            System.out.println(e.getClass().getSimpleName()+", id: "+e.getIdentifiant() +", nom: "+e.getNom() +", salaire :"+e.calculSalaire());
        }
    }
    public void affichePrimeResponsable(){
        for (Employees e:emps) {
            if (e==null){
                break;
            }else if (e instanceof Responsable){
                System.out.println("Prime responsable "+e.getIdentifiant()+" est:"+((Responsable) e).getPrime());

            }
        }
    }

    public void nombreEmp(){
        int nC=0;
        int nV=0;
        int nR=0;
        for (Employees e:emps) {
            if(e instanceof Caissier){
                nC++;
            } else if (e instanceof Responsable){
                nR++;
            }
            else if (e instanceof Vendeur){
                nV++;
            }
        }
        System.out.println("nombre total des emps: "+(nR+nV+nC));
        System.out.println("Caissier: "+nC+", Vendeur: "+nV+", Responsable :"+ nR);
    }


}
