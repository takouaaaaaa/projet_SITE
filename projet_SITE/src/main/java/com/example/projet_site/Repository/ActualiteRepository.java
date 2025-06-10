package com.example.projet_site.Repository;

import com.example.projet_site.entities.Actualite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActualiteRepository extends JpaRepository<Actualite, Long> {}
