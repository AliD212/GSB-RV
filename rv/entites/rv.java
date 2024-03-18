package fr.gsb.rv.entites;

public class rv  {

    private int Numero ;
    private String Annee ;
    private String Mois ;
    private String Bilan ;
    private int CoeffConfiance ;
    private String Motif ;


    public rv(int Numero, String Annee, String Mois, String Bilan, int CoeffConfiance, String Motif) {
        this.Numero = Numero;
        this.Annee = Annee;
        this.Mois = Mois ;
        this.Bilan = Bilan;
        this.CoeffConfiance = CoeffConfiance;
        this.Motif = Motif ;
    }




    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getAnnee() {
        return Annee;
    }

    public void setAnnee(String Annee) {
        this.Annee = Annee;
    }

    public String getMois() {
        return Mois;
    }

    public void setMois(String Mois) {
        this.Mois = Mois;
    }

    public String getBilan() {
        return Bilan;
    }

    public void setBilan(String Bilan) {
        this.Bilan = Bilan;
    }

    public int getCoeffConfiance() {
        return CoeffConfiance;
    }

    public void setCoeffConfiance(int CoeffConfiance) {
        this.CoeffConfiance = CoeffConfiance;
    }

    public String getMotif() {
        return Motif;
    }

    public void setMotif(String Motif) {
        this.Motif = Motif;
    }


}
