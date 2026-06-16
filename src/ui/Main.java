package ui;

import model.Tour;
import data.GestorDatos;
import java.util.ArrayList;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        ArrayList<Tour> listaTour = gestor.Tour("resources/tours.txt");

        System.out.println("\n=== LISTA DE TOURS ===");
        for (Tour t : listaTour) {
            System.out.println(t);
        }

        System.out.printf("\n=====TOURS CON PRECIO >2000=====");
        for (Tour t : listaTour) {
            if (t.getPrecio() > 2000) {
                System.out.println(t);
            }
        }













    }
}