package com.danifgx.opensource.garrapp.controller;
import com.danifgx.opensource.garrapp.model.Garrapata;
import com.danifgx.opensource.garrapp.service.GarrapataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/garrapatas")
public class GarrapataController {

    private final GarrapataService garrapataService;

    @Autowired
    public GarrapataController(GarrapataService garrapataService) {
        this.garrapataService = garrapataService;
    }

    // Endpoint para agregar una nueva garrapata
    @PostMapping
    public ResponseEntity<Garrapata> agregarGarrapata(@RequestBody Garrapata garrapata) {
        Garrapata nuevaGarrapata = garrapataService.agregarGarrapata(garrapata);
        return new ResponseEntity<>(nuevaGarrapata, HttpStatus.CREATED);
    }

    // Endpoint para obtener todas las garrapatas
    @GetMapping
    public ResponseEntity<List<Garrapata>> obtenerTodasLasGarrapatas() {
        List<Garrapata> garrapatas = garrapataService.obtenerTodasLasGarrapatas();
        return new ResponseEntity<>(garrapatas, HttpStatus.OK);
    }

    // Aquí puedes agregar más endpoints según tus necesidades, como obtener garrapatas por fecha, etc.
}
