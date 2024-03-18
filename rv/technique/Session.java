package fr.gsb.rv.technique;

import fr.gsb.rv.entites.Visiteur;

public class Session extends Visiteur {

    private static Session session = null ;
    private Visiteur leVisiteur ;
    private Session(Visiteur leVisiteur) {
        super();
        this.leVisiteur = leVisiteur ;
    }




    public Session getSession(){

        return this.session ;
    }

    public static void ouvrir( Visiteur leVisiteur){

        if (session == null){

            Session session = new Session(leVisiteur) ;
        }


    }

    public static void fermer(){

        Session session = null ;

    }






}
