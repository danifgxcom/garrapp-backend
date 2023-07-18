package com.danifgx.opensource.garrapp.repository;
import com.danifgx.opensource.garrapp.model.Garrapata;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarrapataRepository extends MongoRepository<Garrapata, String> {
    // Aquí podemos agregar métodos personalizados de consulta si los necesitas
}
