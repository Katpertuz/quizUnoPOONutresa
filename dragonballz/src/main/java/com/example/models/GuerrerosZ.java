package com.example.models;

import java.util.UUID;

public class GuerrerosZ {


private UUID id;
private String nombre;
private String raza;
private String planetaOrigen;
private String maestro;
private String tecnicaEspecial;
private long nivelPoderBase;
private Integer nivelKi;
private Integer vecesResucitado;
private boolean estaVivo;
private boolean tieneCola;

public GuerrerosZ() {
    this.id = UUID.randomUUID();
}

public GuerrerosZ(String nombre, String raza, String planetaOrigen, String maestro, String tecnicaEspecial,
        long nivelPoderBase, Integer nivelKi, Integer vecesResucitado, boolean estaVivo, boolean tieneCola) {
    this.id = UUID.randomUUID();
    this.nombre = nombre;
    this.raza = raza;
    this.planetaOrigen = planetaOrigen;
    this.maestro = maestro;
    this.tecnicaEspecial = tecnicaEspecial;
    this.nivelPoderBase = nivelPoderBase;
    this.nivelKi = nivelKi;
    this.vecesResucitado = vecesResucitado;
    this.estaVivo = estaVivo;
    this.tieneCola = tieneCola;
}

public UUID getId() {
    return id;
}

public void setId(UUID id) {
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getRaza() {
    return raza;
}

public void setRaza(String raza) {
    this.raza = raza;
}

public String getPlanetaOrigen() {
    return planetaOrigen;
}

public void setPlanetaOrigen(String planetaOrigen) {
    this.planetaOrigen = planetaOrigen;
}

public String getMaestro() {
    return maestro;
}

public void setMaestro(String maestro) {
    this.maestro = maestro;
}

public String getTecnicaEspecial() {
    return tecnicaEspecial;
}

public void setTecnicaEspecial(String tecnicaEspecial) {
    this.tecnicaEspecial = tecnicaEspecial;
}

public long getNivelPoderBase() {
    return nivelPoderBase;
}

public void setNivelPoderBase(long nivelPoderBase) {
    this.nivelPoderBase = nivelPoderBase;
}

public Integer getNivelKi() {
    return nivelKi;
}

public void setNivelKi(Integer nivelKi) {
    this.nivelKi = nivelKi;
}

public Integer getVecesResucitado() {
    return vecesResucitado;
}

public void setVecesResucitado(Integer vecesResucitado) {
    this.vecesResucitado = vecesResucitado;
}

public boolean isEstaVivo() {
    return estaVivo;
}

public void setEstaVivo(boolean estaVivo) {
    this.estaVivo = estaVivo;
}

public boolean isTieneCola() {
    return tieneCola;
}

public void setTieneCola(boolean tieneCola) {
    this.tieneCola = tieneCola;
}










}
