package com.example;

import com.example.models.Batalla;
import com.example.models.GuerrerosZ;
import com.example.models.Transformacion;

public class Main {
    public static void main(String[] args) {
       

        Batalla batallaUno=new Batalla();
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

        Transformacion transformacionUno=new Transformacion();








    }
}