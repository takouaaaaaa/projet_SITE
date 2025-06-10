package com.example.projet_site.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

@Entity
public class Admin extends Utilisateur {

    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    private List<Actualite> actualites;

    @OneToOne(cascade = CascadeType.ALL)
    private SiteConfiguration siteConfiguration;

    @OneToOne(cascade = CascadeType.ALL)
    private Programme programme;

    public List<Actualite> getActualites() {
        return actualites;
    }

    public void setActualites(List<Actualite> actualites) {
        this.actualites = actualites;
    }

    public SiteConfiguration getSiteConfiguration() {
        return siteConfiguration;
    }

    public void setSiteConfiguration(SiteConfiguration siteConfiguration) {
        this.siteConfiguration = siteConfiguration;
    }

    public Programme getProgramme() {
        return programme;
    }

    public void setProgramme(Programme programme) {
        this.programme = programme;
    }
}
