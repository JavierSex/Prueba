package com.psfPrueba.tuPoliza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PolizaService {
    @Autowired
    private PolizaRepository polizaRepository;

    public Poliza crearPoliza(Poliza poliza) {
        // validación de negocio para verificar que la poliza está vigente
        if (poliza.getFechaFinVigencia().before(new Date())) {
            throw new IllegalArgumentException("La poliza no está vigente");
        }
        return polizaRepository.save(poliza);
    }

    public Poliza obtenerPoliza(String numeroPoliza, String placaVehiculo) {
        return polizaRepository.findByNumeroPolizaOrPlacaVehiculo(numeroPoliza, placaVehiculo);
    }
}


