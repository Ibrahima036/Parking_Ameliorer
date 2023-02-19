/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modele;

/**
 *
 * @author mon pc
 */
public class Users {
    //Déclaration des attributs 
    private String m_nom;
    private String m_prenom;
    private String m_email;
    private String m_mdp;
    private String m_speudo;
    private String m_tel;
    private String m_adresse;
    
//Le constructeur

    public Users(String m_nom, String m_prenom, String m_email, String m_mdp, String m_speudo, String m_tel, String m_adresse) {
        this.m_nom = m_nom;
        this.m_prenom = m_prenom;
        this.m_email = m_email;
        this.m_mdp = m_mdp;
        this.m_speudo = m_speudo;
        this.m_tel = m_tel;
        this.m_adresse = m_adresse;
    }
    
    
    /*les getters et setters*/
    public String getM_adresse() {
        return m_adresse;
    }

    public void setM_tel(String m_tel) {
        this.m_tel = m_tel;
    }

    public void setM_speudo(String m_speudo) {
        this.m_speudo = m_speudo;
    }

    public void setM_prenom(String m_prenom) {
        this.m_prenom = m_prenom;
    }

    public void setM_nom(String m_nom) {
        this.m_nom = m_nom;
    }

    public void setM_mdp(String m_mdp) {
        this.m_mdp = m_mdp;
    }

    public void setM_email(String m_email) {
        this.m_email = m_email;
    }

    public void setM_adresse(String m_adresse) {
        this.m_adresse = m_adresse;
    }

    public String getM_tel() {
        return m_tel;
    }

    public String getM_speudo() {
        return m_speudo;
    }

    public String getM_prenom() {
        return m_prenom;
    }

    public String getM_nom() {
        return m_nom;
    }

    public String getM_mdp() {
        return m_mdp;
    }

    public String getM_email() {
        return m_email;
    }
    
}
