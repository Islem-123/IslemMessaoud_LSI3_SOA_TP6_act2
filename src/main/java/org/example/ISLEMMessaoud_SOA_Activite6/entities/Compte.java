package org.example.ISLEMMessaoud_SOA_Activite6.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor @AllArgsConstructor
public class Compte {
    @Id // Indique que cet attribut est la clé primaire de l'entité
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Génère automatiquement la valeur de la clé primaire
    private Long id;
    private double solde; // Représente le solde du compte
    private Date dateCreation; // Stocke la date de création du compte
    private TypeCompte type; // Référence à un objet de type TypeCompte, décrivant le type de compte
    private EtatCompte etat; // Référence à un objet de type EtatCompte, décrivant l'état du compte
}













    //