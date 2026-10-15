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
        
        System.out.println("la batalla tuvo lugar en "+batallaDos.getLugarCombate());
        System.out.println("tuvo una duracion de "+batallaDos.getDuracionMinutos());
        System.out.println("el nivel de destrucción del entorno fue "+batallaDos.getNivelDestruccionEntorno());
        System.out.println("el nombre del retador fue "+batallaDos.getNombreRetador());
        System.out.println("mientras que su oponente fue "+batallaDos.getNombreOponente());
        System.out.println("el estado de la batalla es "+batallaDos.getEstadoBatalla());
        System.out.println("y es "+batallaDos.isPlanetaDestruido()+" que el planeta fue destruido");
        System.out.println("es "+batallaDos.isUsoSemillasErmitanio()+" que se hizo uso de la semilla del Ermitaño");
        System.out.println("el ganadoor fue "+batallaDos.getNombreGanador());
        System.out.println("y todo esto se pudo ver en la "+batallaDos.getNombreSaga());
        
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

        System.out.println("El guerreo "+ guerrerosDos.getNombre());
        System.out.println("Fue entrenado por "+ guerrerosDos.getMaestro());
        System.out.println("El guerrero es de raza "+ guerrerosDos.getRaza());
        System.out.println("fue resucitado "+ guerrerosDos.getVecesResucitado()+" veces ");
        System.out.println("en este momento es "+ guerrerosDos.isEstaVivo()+"que esta vivo");
        System.out.println("pero es"+guerrerosDos.isTieneCola()+"que tiene cola");
        System.out.println("Su técnica especial es "+guerrerosDos.getTecnicaEspecial());
        System.out.println("tiene un nivel de ki "+guerrerosDos.getNivelKi());
        System.out.println("y un nivel poder base de "+guerrerosDos.getNivelPoderBase());
        System.out.println("El guerrero proviene del planeta "+guerrerosDos.getPlanetaOrigen());

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
         

        System.out.println("La fase de transformación del guerreo es "+ transformacionDos.getNombreFase());
        System.out.println("el color de su aura es "+ transformacionDos.getColorAura());
        System.out.println("el color del cabello es "+ transformacionDos.getColorcabello());
        System.out.println("presenta cambios como: "+ transformacionDos.getAlteracionesFisicas());
        System.out.println("¿tiene desgaste de energia?: "+ transformacionDos.isDesgastaEnergia());
        System.out.println("¿requiere furia?: "+ transformacionDos.isRequiereFuria());
        System.out.println("¿Su ki es divino?: "+ transformacionDos.isEsKiDivino());
        System.out.println("su multiplicador de poder es "+ transformacionDos.getMultiplicadorDePoder());
        System.out.println("la duración máxima en minutos es de "+ transformacionDos.getDuracionMaximaMinutos());
        System.out.println("su ki mínimo requerido es: "+ transformacionDos.getKiMinimoRequerido());
        

        batallaUno.setDuracionMinutos(45);
        batallaUno.setEstadoBatalla("Finalizada");
        batallaUno.setLugarCombate("Juegos de Cell");
        batallaUno.setNivelDestruccionEntorno(9);
        batallaUno.setNombreGanador("Gohan");
        batallaUno.setNombreRetador("Gohan");
        batallaUno.setNombreSaga("Saga de Cell");
        batallaUno.setPlanetaDestruido(false);
        batallaUno.setUsoSemillasErmitanio(true);
        batallaUno.setNombreOponente("Cell");

        System.out.println("la batalla tuvo lugar en "+batallaUno.getLugarCombate());
        System.out.println("tuvo una duracion de "+batallaUno.getDuracionMinutos());
        System.out.println("el nivel de destrucción del entorno fue "+batallaUno.getNivelDestruccionEntorno());
        System.out.println("el nombre del retador fue "+batallaUno.getNombreRetador());
        System.out.println("mientras que su oponente fue "+batallaUno.getNombreOponente());
        System.out.println("el estado de la batalla es "+batallaUno.getEstadoBatalla());
        System.out.println("y es "+batallaUno.isPlanetaDestruido()+" que el planeta fue destruido");
        System.out.println("es "+batallaUno.isUsoSemillasErmitanio()+" que se hizo uso de la semilla del Ermitaño");
        System.out.println("el ganadoor fue "+batallaUno.getNombreGanador());
        System.out.println("y todo esto se pudo ver en la "+batallaUno.getNombreSaga());


        guerrerosUno.setEstaVivo(true);
        guerrerosUno.setMaestro("Maestro Roshi");
        guerrerosUno.setNombre("Goku");
        guerrerosUno.setRaza("Sayajin");
        guerrerosUno.setVecesResucitado(2);
        guerrerosUno.setPlanetaOrigen("Planeta Vegeta");
        guerrerosUno.setTecnicaEspecial("Kamehameha");
        guerrerosUno.setTieneCola(false);
        guerrerosUno.setNivelKi(9000);
        guerrerosUno.setNivelPoderBase(15000L);

        System.out.println("El guerreo "+ guerrerosUno.getNombre());
        System.out.println("Fue entrenado por "+ guerrerosUno.getMaestro());
        System.out.println("El guerrero es de raza "+ guerrerosUno.getRaza());
        System.out.println("fue resucitado "+ guerrerosUno.getVecesResucitado()+"veces");
        System.out.println("en este momento es "+ guerrerosUno.isEstaVivo()+"que esta vivo");
        System.out.println("pero es"+guerrerosUno.isTieneCola()+"que tiene cola");
        System.out.println("Su técnica especial es "+guerrerosUno.getTecnicaEspecial());
        System.out.println("tiene un nivel de ki "+guerrerosUno.getNivelKi());
        System.out.println("y un nivel poder base de "+guerrerosUno.getNivelPoderBase());
        System.out.println("El guerrero proviene del planeta "+guerrerosUno.getPlanetaOrigen());



        transformacionUno.setNombreFase("Super Saiyajin 1");
        transformacionUno.setColorAura("Dorado");
        transformacionUno.setColorcabello("Rubio");
        transformacionUno.setAlteracionesFisicas("Ojos verdes y cabello erizado");
        transformacionUno.setDesgastaEnergia(false);
        transformacionUno.setRequiereFuria(true );
        transformacionUno.setEsKiDivino(false);
        transformacionUno.setMultiplicadorDePoder(50.0);
        transformacionUno.setDuracionMaximaMinutos(60);
        transformacionUno.setKiMinimoRequerido(3000000L);

        System.out.println("La fase de transformación del guerreo es "+ transformacionUno.getNombreFase());
        System.out.println("el color de su aura es "+ transformacionUno.getColorAura());
        System.out.println("el color del cabello es "+ transformacionUno.getColorcabello());
        System.out.println("presenta cambios como: "+ transformacionUno.getAlteracionesFisicas());
        System.out.println("¿tiene desgaste de energia?: "+ transformacionUno.isDesgastaEnergia());
        System.out.println("¿requiere furia?: "+ transformacionUno.isRequiereFuria());
        System.out.println("¿Su ki es divino?: "+ transformacionUno.isEsKiDivino());
        System.out.println("su multiplicador de poder es "+ transformacionUno.getMultiplicadorDePoder());
        System.out.println("la duración máxima en minutos es de "+ transformacionUno.getDuracionMaximaMinutos());
        System.out.println("su ki mínimo requerido es: "+ transformacionUno.getKiMinimoRequerido());
        





    }
}