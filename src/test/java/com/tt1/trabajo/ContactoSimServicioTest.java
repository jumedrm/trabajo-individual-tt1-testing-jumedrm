package com.tt1.trabajo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import servicios.ContactoSimServicio;
import modelo.DatosSolicitud;
import java.util.HashMap;

class ContactoSimServicioTest {

    private ContactoSimServicio servicio;

    @BeforeEach
    void setUp() {
        // arrange
        servicio = new ContactoSimServicio();
    }

    @Test
    void testSolicitarSimulationRetornaDefault() {
        // act
        DatosSolicitud ds = new DatosSolicitud(new HashMap<>());
        int resultado = servicio.solicitarSimulation(ds);
        
        // assert
        assertEquals(-1, resultado, "debe retornar -1 mientras no esté implementado");
    }

    @Test
    void testGetEntitiesNoEsNulo() {
        // act & assert
        assertNotNull(servicio.getEntities(), "la lista de entidades no debe ser nula");
    }
}