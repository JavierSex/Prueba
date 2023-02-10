package com.psfPrueba.tuPoliza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolizaRepository extends JpaRepository<Poliza, Long> {

    Poliza findByNumeroPolizaOrPlacaVehiculo(String numeroPoliza, String placaVehiculo);
}