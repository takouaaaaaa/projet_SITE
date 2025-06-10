package com.example.projet_site.entities;

import jakarta.persistence.*;

@Entity
public class SiteConfiguration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private byte[] logo;

    @Lob
    private byte[] affiche;

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public byte[] getAffiche() {
        return affiche;
    }

    public void setAffiche(byte[] affiche) {
        this.affiche = affiche;
    }

    public String getTitreSite() {
        return titreSite;
    }

    public void setTitreSite(String titreSite) {
        this.titreSite = titreSite;
    }

    private String titreSite;

}
