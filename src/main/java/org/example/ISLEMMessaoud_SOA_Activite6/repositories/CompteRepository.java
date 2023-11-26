package org.example.ISLEMMessaoud_SOA_Activite6.repositories;

// Importation de la classe Compte qui représente l'entité pour laquelle ce repository est créé
import org.example.ISLEMMessaoud_SOA_Activite6.entities.Compte;

// Importation de l'interface JpaRepository fournie par Spring Data JPA
import org.springframework.data.jpa.repository.JpaRepository;

// Définition de l'interface CompteRepository qui étend JpaRepository
public interface CompteRepository extends JpaRepository<Compte, Long> {}
// Cette interface étend JpaRepository, elle hérite donc de toutes les
// méthodes définies dans JpaRepository.