package com.example;

import com.example.models.Batalla;
import com.example.models.GuerrerosZ;
import com.example.models.Transformacion;

public class Main {
    public static void main(String[] args) {
       

        Batalla batallaUno=new Batalla();
        System.out.println(batallaUno.getId());
        System.out.println(batallaUno.getEstadoBatalla());
        System.out.println(batallaUno.getLugarCombate());
        System.out.println(batallaUno.getNombreGanador());
        System.out.println(batallaUno.getNombreOponente());
        System.out.println(batallaUno.getNombreSaga());
        System.out.println(batallaUno.getNombreRetador());
        System.out.println(batallaUno.getDuracionMinutos());
        System.out.println(batallaUno.getNivelDestruccionEntorno());
        System.out.println(batallaUno.isUsoSemillasErmitanio());
        System.out.println(batallaUno.isPlanetaDestruido());

        Batalla batallaDos=new Batalla("Goku","Freezer","Planeta Namekusei", "Saga de Freezer", "Goku", "Finalizada",120, false, true,10);

        GuerrerosZ guerrerosUno=new GuerrerosZ();
        System.out.println(guerrerosUno.getId());
        System.out.println(guerrerosUno.getMaestro());
        System.out.println(guerrerosUno.getNivelPoderBase());
        System.out.println(guerrerosUno.getNombre());
        System.out.println(guerrerosUno.getPlanetaOrigen());
        System.out.println(guerrerosUno.getRaza());
        System.out.println(guerrerosUno.getTecnicaEspecial());
        System.out.println(guerrerosUno.getNivelKi());
        System.out.println(guerrerosUno.getVecesResucitado());
        System.out.println(guerrerosUno.isEstaVivo());
        System.out.println(guerrerosUno.isTieneCola());

        GuerrerosZ guerrerosDos=new GuerrerosZ("Vegeta", "Sayayin","planeta Vegeta","ninguno","Resplandor final", 18000, 5000, 0, true, true);

        Transformacion transformacionUno=new Transformacion();
        System.out.println(transformacionUno.getId());
        System.out.println(transformacionUno.getAlteracionesFisicas());
        System.out.println(transformacionUno.getColorAura());
        System.out.println(transformacionUno.getColorcabello());
        System.out.println(transformacionUno.getKiMinimoRequerido());
        System.out.println(transformacionUno.getNombreFase());
        System.out.println(transformacionUno.getDuracionMaximaMinutos());
        System.out.println(transformacionUno.getMultiplicadorDePoder());
        System.out.println(transformacionUno.isDesgastaEnergia());
        System.out.println(transformacionUno.isEsKiDivino());
        System.out.println(transformacionUno.isRequiereFuria());


        Transformacion transformacionDos=new Transformacion("Super Saiyajin 3", "Dorada con relámpagos", "Rubio largo","Pérdida de cejas y cabello largo",true,false,false,400.0,30,5000000L);








    }
}