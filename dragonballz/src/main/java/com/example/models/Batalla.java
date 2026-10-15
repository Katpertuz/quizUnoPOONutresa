package com.example.models;

import java.util.UUID;

public class Batalla {

    private UUID id;
    private String nombreRetador;
    private String nombreOponente;
    private String lugarCombate;
    private String nombreSaga;
    private String nombreGanador;
    private String estadoBatalla;
    private Integer duracionMinutos;
    private boolean usoSemillasErmitanio;
    private boolean planetaDestruido;
    private Integer nivelDestruccionEntorno;

    public Batalla() {
        this.id = UUID.randomUUID();
    }

    public Batalla(String nombreRetador, String nombreOponente, String lugarCombate, String nombreSaga,
            String nombreGanador, String estadoBatalla, Integer duracionMinutos, boolean usoSemillasErmitanio,
            boolean planetaDestruido, Integer nivelDestruccionEntorno) {
        this.id = UUID.randomUUID();
        this.nombreRetador = nombreRetador;
        this.nombreOponente = nombreOponente;
        this.lugarCombate = lugarCombate;
        this.nombreSaga = nombreSaga;
        this.nombreGanador = nombreGanador;
        this.estadoBatalla = estadoBatalla;
        this.duracionMinutos = duracionMinutos;
        this.usoSemillasErmitanio = usoSemillasErmitanio;
        this.planetaDestruido = planetaDestruido;
        this.nivelDestruccionEntorno = nivelDestruccionEntorno;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombreRetador() {
        return nombreRetador;
    }

    public void setNombreRetador(String nombreRetador) {
        this.nombreRetador = nombreRetador;
    }

    public String getNombreOponente() {
        return nombreOponente;
    }

    public void setNombreOponente(String nombreOponente) {
        this.nombreOponente = nombreOponente;
    }

    public String getLugarCombate() {
        return lugarCombate;
    }

    public void setLugarCombate(String lugarCombate) {
        this.lugarCombate = lugarCombate;
    }

    public String getNombreSaga() {
        return nombreSaga;
    }

    public void setNombreSaga(String nombreSaga) {
        this.nombreSaga = nombreSaga;
    }

    public String getNombreGanador() {
        return nombreGanador;
    }

    public void setNombreGanador(String nombreGanador) {
        this.nombreGanador = nombreGanador;
    }

    public String getEstadoBatalla() {
        return estadoBatalla;
    }

    public void setEstadoBatalla(String estadoBatalla) {
        this.estadoBatalla = estadoBatalla;
    }

    public Integer getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(Integer duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public boolean isUsoSemillasErmitanio() {
        return usoSemillasErmitanio;
    }

    public void setUsoSemillasErmitanio(boolean usoSemillasErmitanio) {
        this.usoSemillasErmitanio = usoSemillasErmitanio;
    }

    public boolean isPlanetaDestruido() {
        return planetaDestruido;
    }

    public void setPlanetaDestruido(boolean planetaDestruido) {
        this.planetaDestruido = planetaDestruido;
    }

    public Integer getNivelDestruccionEntorno() {
        return nivelDestruccionEntorno;
    }

    public void setNivelDestruccionEntorno(Integer nivelDestruccionEntorno) {
        this.nivelDestruccionEntorno = nivelDestruccionEntorno;
    }

    








}
