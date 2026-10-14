package com.example.models;

public class Transformacion {

    private String nombreFase;
    private String colorAura;
    private String colorcabello;
    private String alteracionesFisicas;
    private boolean desgastaEnergia;
    private boolean requiereFuria;
    private boolean esKiDivino;
    private Double multiplicadorDePoder;
    private Integer duracionMaximaMinutos;
    private long kiMinimoRequerido;

    
    public Transformacion() {
    }


    public Transformacion(String nombreFase, String colorAura, String colorcabello, String alteracionesFisicas,
            boolean desgastaEnergia, boolean requiereFuria, boolean esKiDivino, Double multiplicadorDePoder,
            Integer duracionMaximaMinutos, long kiMinimoRequerido) {
        this.nombreFase = nombreFase;
        this.colorAura = colorAura;
        this.colorcabello = colorcabello;
        this.alteracionesFisicas = alteracionesFisicas;
        this.desgastaEnergia = desgastaEnergia;
        this.requiereFuria = requiereFuria;
        this.esKiDivino = esKiDivino;
        this.multiplicadorDePoder = multiplicadorDePoder;
        this.duracionMaximaMinutos = duracionMaximaMinutos;
        this.kiMinimoRequerido = kiMinimoRequerido;
    }


    public String getNombreFase() {
        return nombreFase;
    }


    public void setNombreFase(String nombreFase) {
        this.nombreFase = nombreFase;
    }


    public String getColorAura() {
        return colorAura;
    }


    public void setColorAura(String colorAura) {
        this.colorAura = colorAura;
    }


    public String getColorcabello() {
        return colorcabello;
    }


    public void setColorcabello(String colorcabello) {
        this.colorcabello = colorcabello;
    }


    public String getAlteracionesFisicas() {
        return alteracionesFisicas;
    }


    public void setAlteracionesFisicas(String alteracionesFisicas) {
        this.alteracionesFisicas = alteracionesFisicas;
    }


    public boolean isDesgastaEnergia() {
        return desgastaEnergia;
    }


    public void setDesgastaEnergia(boolean desgastaEnergia) {
        this.desgastaEnergia = desgastaEnergia;
    }


    public boolean isRequiereFuria() {
        return requiereFuria;
    }


    public void setRequiereFuria(boolean requiereFuria) {
        this.requiereFuria = requiereFuria;
    }


    public boolean isEsKiDivino() {
        return esKiDivino;
    }


    public void setEsKiDivino(boolean esKiDivino) {
        this.esKiDivino = esKiDivino;
    }


    public Double getMultiplicadorDePoder() {
        return multiplicadorDePoder;
    }


    public void setMultiplicadorDePoder(Double multiplicadorDePoder) {
        this.multiplicadorDePoder = multiplicadorDePoder;
    }


    public Integer getDuracionMaximaMinutos() {
        return duracionMaximaMinutos;
    }


    public void setDuracionMaximaMinutos(Integer duracionMaximaMinutos) {
        this.duracionMaximaMinutos = duracionMaximaMinutos;
    }


    public long getKiMinimoRequerido() {
        return kiMinimoRequerido;
    }


    public void setKiMinimoRequerido(long kiMinimoRequerido) {
        this.kiMinimoRequerido = kiMinimoRequerido;
    }

    







}
