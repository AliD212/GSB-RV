package fr.gsb.rv.models;

import java.util.ArrayList;
import java.util.List ;

import fr.gsb.rv.entites.Visiteur;
import fr.gsb.rv.entites.rv ;

public class ModeleGsb extends Visiteur {

    private static ModeleGsb modele = null ;




    private List<Visiteur> lesVisiteurs = new ArrayList<Visiteur>() ;
    private List<rv> RV = new ArrayList<rv>() ;

    private ModeleGsb(){
        super();

        this.peupler() ;
    }

    public static ModeleGsb getInstance(){
        if( ModeleGsb.modele == null ){
            modele = new ModeleGsb() ;
        }
        return ModeleGsb.modele ;
    }

    private void peupler(){
        this.lesVisiteurs.add( new Visiteur("a131","azerty","Villechalane","Louis") ) ;
        this.lesVisiteurs.add( new Visiteur("b13","azerty","Bentot","Pascal") ) ;
        this.lesVisiteurs.add( new Visiteur("b16","azerty","Bioret","Luc") ) ;
        this.lesVisiteurs.add( new Visiteur("a17","azerty","Andre","David") ) ;
    }

    private void peupler2(){


        this.RV.add(new rv(1, "2024", "Janvier", "Bilan 1", 5, "Motif 1")) ;
        this.RV.add(new rv(2, "2024", "Juillet", "Bilan 2", 4, "Motif 2"));
        this.RV.add(new rv(3, "2024", "Mars", "Bilan 3", 3, "Motif 3"));
        this.RV.add(new rv(4, "2024", "Mars", "Bilan 4", 2, "Motif 4"));


    }

    public Visiteur seConnecter(String matricule, String mdp){

        for( Visiteur unVisiteur : this.lesVisiteurs ){
            if( unVisiteur.getMatricule().equals(matricule) && unVisiteur.getMdp().equals(mdp) ){
                return unVisiteur ;
            }
        }

        return null ;

    }

}
