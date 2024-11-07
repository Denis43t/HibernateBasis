package org.example;

import org.example.model.Client;
import org.example.model.Planet;
import org.example.service.ClientCrudService;
import org.example.service.PlanetCrudService;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
//        Client client = Client.builder()
//                .name("suu")
//                .build();
//        ClientCrudService crudService = new ClientCrudService();
//        crudService.save(client);
////        crudService.delete(client);
        Planet planet = Planet.builder()
                .id("CARS")
                .name("Carus")
                .build();
        PlanetCrudService planetCrudService = new PlanetCrudService();
//        planetCrudService.save(planet);
        planetCrudService.delete(planet);
    }
}