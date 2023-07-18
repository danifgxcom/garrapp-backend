package com.danifgx.opensource.garrapp.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "garrapatas")
@Data
public class Garrapata {
    @Id
    private String id;
    private double latitud;
    private double longitud;
    private String fechaHora;

    // Constructor, getters, setters, y otros métodos (si es necesario)

    // Constructor sin argumentos (obligatorio para Spring Data MongoDB)
    public Garrapata() {
    }

    // Constructor con todos los atributos (opcional)
    public Garrapata(double latitud, double longitud, String fechaHora) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.fechaHora = fechaHora;
    }
}
