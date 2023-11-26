package org.example.ISLEMMessaoud_SOA_Activite6;
import org.example.ISLEMMessaoud_SOA_Activite6.entities.Compte;
import org.example.ISLEMMessaoud_SOA_Activite6.entities.EtatCompte;
import org.example.ISLEMMessaoud_SOA_Activite6.entities.TypeCompte;
import org.example.ISLEMMessaoud_SOA_Activite6.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Date;
@SpringBootApplication
public class IslemMessaoudSoaActivite6Application {
	public static void main(String[] args) {
//démarre l'application Spring boot
		SpringApplication.run(IslemMessaoudSoaActivite6Application.class, args);}
// Méthode Bean qui s'exécutera au démarrage de l'application
@Bean
	public CommandLineRunner start (CompteRepository compterep) {
	return args -> {
		// Création de trois comptes avec des valeurs différentes
		Compte c1 = new Compte(null, 123, new Date(), TypeCompte.EPARGNE, EtatCompte.ACTIVE);
		Compte c2 = new Compte(null, 145, new Date(), TypeCompte.EPARGNE, EtatCompte.ACTIVE);
		Compte c3 = new Compte(null, 255, new Date(), TypeCompte.COURANT, EtatCompte.SUSPENDU);
		// Enregistrement des comptes dans la base de données via le CompteRepository
		compterep.save(c1);
		compterep.save(c2);
		compterep.save(c3);
		// Récupération de tous les comptes enregistrés et affichage de leur solde
		compterep.findAll().forEach(c -> {
			System.out.println(c.getSolde());
		});
	};}}
