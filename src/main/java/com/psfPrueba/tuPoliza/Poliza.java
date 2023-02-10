package com.psfPrueba.tuPoliza;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "poliza")
public class Poliza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroPoliza;
    private String nombreCliente;
    private String identificacionCliente;
    private Date fechaNacimientoCliente;
    private Date fechaPoliza;
    private String coberturasCubieras;
    private Double valorMaximoCubiero;
    private String nombrePlan;
    private String ciudadResidencia;
    private String direccionResidencia;
    private String placaAutomotor;
    private String modeloAutomotor;
    private Boolean tieneInspeccion;
    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;

    public Poliza() {
    }

    public Poliza(String numeroPoliza, String nombreCliente, String identificacionCliente, Date fechaNacimientoCliente, Date fechaPoliza, String coberturasCubieras, Double valorMaximoCubiero, String nombrePlan, String ciudadResidencia, String direccionResidencia, String placaAutomotor, String modeloAutomotor, Boolean tieneInspeccion, Date fechaInicioVigencia, Date fechaFinVigencia) {
        this.numeroPoliza = numeroPoliza;
        this.nombreCliente = nombreCliente;
        this.identificacionCliente = identificacionCliente;
        this.fechaNacimientoCliente = fechaNacimientoCliente;
        this.fechaPoliza = fechaPoliza;
        this.coberturasCubieras = coberturasCubieras;
        this.valorMaximoCubiero = valorMaximoCubiero;
        this.nombrePlan = nombrePlan;
        this.ciudadResidencia = ciudadResidencia;
        this.direccionResidencia = direccionResidencia;
        this.placaAutomotor = placaAutomotor;
        this.modeloAutomotor = modeloAutomotor;
        this.tieneInspeccion = tieneInspeccion;
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.fechaFinVigencia = fechaFinVigencia;
    }

    // getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getIdentificacionCliente() {
        return identificacionCliente;
    }

    public void setIdentificacionCliente(String identificacionCliente) {
        this.identificacionCliente = identificacionCliente;
    }

    public Date getFechaNacimientoCliente() {
        return fechaNacimientoCliente;
    }

    public void setFechaNacimientoCliente(Date fechaNacimientoCliente) {
        this.fechaNacimientoCliente = fechaNacimientoCliente;
    }

    public Date getFechaPoliza() {
        return fechaPoliza;
    }

    public void setFechaPoliza(Date fechaPoliza) {
        this.fechaPoliza = fechaPoliza;
    }

    public String getCoberturasCubieras() {
        return coberturasCubieras;
    }

    public void setCoberturasCubieras(String coberturasCubieras) {
        this.coberturasCubieras = coberturasCubieras;
    }

    public Double getValorMaximoCubiero() {
        return valorMaximoCubiero;
    }

    public void setValorMaximoCubiero(Double valorMaximoCubiero) {
        this.valorMaximoCubiero = valorMaximoCubiero;
    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getPlacaAutomotor() {
        return placaAutomotor;
    }

    public void setPlacaAutomotor(String placaAutomotor) {
        this.placaAutomotor = placaAutomotor;
    }

    public String getModeloAutomotor() {
        return modeloAutomotor;
    }

    public void setModeloAutomotor(String modeloAutomotor) {
        this.modeloAutomotor = modeloAutomotor;
    }

    public Boolean getTieneInspeccion() {
        return tieneInspeccion;
    }

    public void setTieneInspeccion(Boolean tieneInspeccion) {
        this.tieneInspeccion = tieneInspeccion;
    }

    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }
}

