package data;

import model.Tour;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> Tour(String rutaArchivo) {

        ArrayList<Tour> listaTour = new ArrayList<>();

        try {

            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            String linea;

            while ((linea = lector.readLine()) != null) {

                String[] partes = linea.split(";");

                if (partes.length == 3) {

                    String nombre = partes[0];
                    String ubicacion = partes[1];
                    int precio = Integer.parseInt(partes[2]);

                    Tour tour = new Tour(nombre, ubicacion,precio);

                    listaTour.add(tour);
                }
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir un numero: " + e.getMessage());
        }

        return listaTour;
    }

}
