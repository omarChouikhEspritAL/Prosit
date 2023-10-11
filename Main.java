import tn.tuniprob.gestionemployees.Caissier;
import tn.tuniprob.gestionemployees.Responsable;
import tn.tuniprob.gestionemployees.Vendeur;
import tn.tuniprob.gestionmagasin.magasin.Magasin;
import tn.tuniprob.gestionmagasin.produit.Produit;


public class Main {
        public static void main(String[] args) {

            Produit p1 = new Produit(1021, "lait");
            p1.setMarque("delice");
            p1.setPrix(0.700);

            Produit p2 = new Produit(2510, "Yaourt");
            p2.setMarque("Vitalait");
            p2.setPrix(0.900);

            Produit p3 = new Produit(3250, "Tomate");
            p3.setMarque("Sicam");
            p3.setPrix(1.200);

            p1.afficher();
            p2.afficher();
            p3.afficher();

            Magasin m = new Magasin();
            m.ajoutprod(p1);
            m.ajoutprod(p2);
            System.out.println(m.toString());
            System.out.println("nombre de produits dans tous les magasins: "+Magasin.getNombreProd());

            Magasin m1 = new Magasin();
            m1.ajoutprod(p1);
            m1.ajoutprod(p2);
            m1.ajoutprod(p3);
            System.out.println(m1);
            System.out.println("nombre de produits dans tous les magasins: "+Magasin.getNombreProd());
            System.out.println("méthode comparer avec 2 produits: "+p1.comparer(p2));
            System.out.println("méthode comparer avec 1 produit: "+p2.comparer(p1));
            System.out.println("méthode de rechreche produit: "+m1.rechercheProd(p1));
            m1.deleteProdMag(p1);
            System.out.println(m1);
            System.out.println("nombre de produits dans tous les magasins: "+Magasin.getNombreProd());
            System.out.println(Magasin.plusProduit(m1,m));

            Magasin magasin1 = new Magasin(1,"Carrefour","Centre-Ville");
            Magasin magasin2 = new Magasin(2,"Monoprix","Menzah 6");

            magasin1.setEmps(new Caissier(1,"caiss1","adr1",10,004));
            magasin1.setEmps(new Caissier(2,"caiss2","adr2",10,003));
            magasin1.setEmps(new Vendeur(1,"vend1","adr1",10,40));
            magasin1.setEmps(new Responsable(1,"resp1","adr1",10,90.0f));
            magasin1.ajoutprod(p1);
            magasin1.ajoutprod(p2);
            magasin1.ajoutprod(p3);

            magasin2.setEmps(new Vendeur(1,"vend1","adr1",10,40));
            magasin2.setEmps(new Vendeur(2,"vend2","adr2",10,40));
            magasin2.setEmps(new Vendeur(3,"vend3","adr3",10,40));
            magasin2.setEmps(new Responsable(1,"resp1","adr1",10,90.0f));
            System.out.println(magasin1);
            System.out.println("*****************");
            magasin1.afficheSalaireEmps();
            System.out.println("*****************");
            magasin1.affichePrimeResponsable();
            System.out.println("*****************");
            magasin1.nombreEmp();
            System.out.println(new Vendeur(1,"vend1","adr1",10,40).equals(new Vendeur(1,"vend1","adr1",10,40)));
        }
}