package ihm.rps.metier;

/**
 * Created by user on 25/10/2016.
 */

public class Intervention {

    private String dateHeure;

    private String nomClient;

    private String categorie;

    private String heureSuivant;

    public Intervention(String dateHeure, String nomClient, String categorie, String heureSuivant) {
        this.dateHeure = dateHeure;
        this.nomClient = nomClient;
        this.categorie = categorie;
        this.heureSuivant = heureSuivant;
    }

    public String getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(String dateHeure) {
        this.dateHeure = dateHeure;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getHeureSuivant() {
        return heureSuivant;
    }

    public void setHeureSuivant(String heureSuivant) {
        this.heureSuivant = heureSuivant;
    }
}
