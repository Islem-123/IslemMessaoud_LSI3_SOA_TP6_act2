package org.example.ISLEMMessaoud_SOA_Activite6.web;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import org.example.ISLEMMessaoud_SOA_Activite6.entities.Compte;
import org.example.ISLEMMessaoud_SOA_Activite6.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import java.util.List;
public class CompteRestJaxRSPAO {
    @Component
    @Path("/banque")
    public class CompteRestJaxRSAPO {
            @Autowired
            private CompteRepository compteRepository;

            // Endpoint pour récupérer la liste des comptes bancaires au format JSON ou XML
            @Path("/comptes")
            @GET
            @Produces({MediaType.APPLICATION_JSON_VALUE , MediaType.APPLICATION_XML_VALUE})
            @Transactional
            public List<Compte> compteList() {
                // Récupère et retourne la liste de tous les comptes depuis le CompteRepository
                return compteRepository.findAll();
            }

            // Endpoint pour récupérer un compte spécifique par son identifiant au format JSON
            @Path("/comptes/{id}")
            @GET
            @Produces({MediaType.APPLICATION_JSON_VALUE})
            public Compte getOne(@PathParam(value = "id") Long id) {
                // Récupère et renvoie un compte spécifique en fonction de son identifiant depuis le CompteRepository
                return compteRepository.findById(id).get();
            }

            // Endpoint pour créer un nouveau compte en utilisant les données fournies au format JSON
            @Path("/comptes")
            @POST
            @Produces({MediaType.APPLICATION_JSON_VALUE})
            public Compte save(Compte compte) {
                // Enregistre et retourne le nouveau compte créé en utilisant les données reçues dans le CompteRepository
                return compteRepository.save(compte);
            }

            // Endpoint pour mettre à jour un compte existant en utilisant les données fournies au format JSON
            @Path("/comptes/{id}")
            @PUT
            @Produces(value = {MediaType.APPLICATION_JSON_VALUE})
            public Compte update(Compte compte, @PathParam(value = "id") Long id) {
                // Met à jour et retourne le compte existant correspondant à l'identifiant fourni dans le CompteRepository
                compte.setId(id);
                return compteRepository.save(compte);
            }

            // Endpoint pour supprimer un compte en fonction de son identifiant au format JSON
            @Path("/comptes/{id}")
            @DELETE
            @Produces({MediaType.APPLICATION_JSON_VALUE})
            public void delete(@PathParam(value = "id") Long id) {
                // Supprime le compte correspondant à l'identifiant fourni du CompteRepository
                compteRepository.deleteById(id);
            }
        }

    }

