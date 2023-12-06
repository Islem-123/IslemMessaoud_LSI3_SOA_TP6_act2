package org.example.ISLEMMessaoud_SOA_Activite6;

import org.example.ISLEMMessaoud_SOA_Activite6.web.CompteRestJaxRSPAO;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.autoconfigure.jersey.ResourceConfigCustomizer;
import org.springframework.context.annotation.Bean;

public class MyConfig {
    @Bean
    public ResourceConfig resourceConfig(){
        // Crée une instance de ResourceConfig, une classe fournie par Jersey pour la configuration des
        // ressources JAX-RS
        ResourceConfig jerseyServlet = new ResourceConfig();

        // Enregistre la classe CompteRestJaxRSPAO (classe JAX-RS) en tant que ressource dans
        // la configuration Jersey
        jerseyServlet.register(CompteRestJaxRSPAO.class);

        // Retourne l'instance de ResourceConfig configurée avec la classe JAX-RS enregistrée
        return jerseyServlet;

    }
}
