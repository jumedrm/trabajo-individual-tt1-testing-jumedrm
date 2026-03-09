package com.tt1.trabajo.utilidades;

import org.springframework.stereotype.Service;
import com.tt1.trabajo.utilidades.api.EmailApi;
import com.tt1.trabajo.utilidades.api.SolicitudApi;
import com.tt1.trabajo.utilidades.ApiClient;
import jakarta.annotation.PostConstruct;

@Service
public class ConsumidorServicio {

    private final EmailApi emailApi;
    private final SolicitudApi solicitudApi;

    public ConsumidorServicio() {
        // 1. Configuramos el cliente para que apunte a la Máquina Virtual
        ApiClient client = new ApiClient();
        client.setBasePath("http://localhost:8080");
        
        // 2. Inicializamos las APIs generadas automáticamente por Maven
        this.emailApi = new EmailApi(client);
        this.solicitudApi = new SolicitudApi(client);
    }

    @PostConstruct
    public void alArrancar() {
        // Este mensaje saldrá en la consola al iniciar la aplicación
        System.out.println("LOG: El paquete de utilidades ya está vinculado a los servicios de la VM.");
    }
}
