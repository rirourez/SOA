package com.ryadh.voitures.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ryadh.voitures.entities.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {

}
