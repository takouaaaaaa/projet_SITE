package com.example.projet_site.Repository;

import com.example.projet_site.entities.SiteConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteConfigurationRepository extends JpaRepository<SiteConfiguration, Long> {}
