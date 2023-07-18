package com.danifgx.opensource.garrapp.service;
import com.danifgx.opensource.garrapp.model.Garrapata;
import com.danifgx.opensource.garrapp.repository.GarrapataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GarrapataService {

    private final GarrapataRepository garrapataRepository;

    @Autowired
    public GarrapataService(GarrapataRepository garrapataRepository) {
        this.garrapataRepository = garrapataRepository;
    }

    // Método para agregar una nueva garrapata
    public Garrapata agregarGarrapata(Garrapata garrapata) {
        return garrapataRepository.save(garrapata);
    }

    // Método para obtener todas las garrapatas
    public List<Garrapata> obtenerTodasLasGarrapatas() {
        return garrapataRepository.findAll();
    }

    // Aquí puedes agregar más métodos de servicio según tus necesidades, como obtener garrapatas por fecha, etc.
}
