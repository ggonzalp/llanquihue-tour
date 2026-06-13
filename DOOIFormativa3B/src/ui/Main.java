package ui;


import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

/**
 * Clase principal del proyecto LlanquihueTourApp
 * Se encargará de crear las clases que la componen,
 * imprime y guarda los datos en el archivo.
 *
 */

public class Main {

    /**
     * Metodo principal donde se ejecuta la aplicación.
     * @param args argumentos de la línea de comandos.
     */

    public static void main(String[] args) {

        Tour tour1 = new Tour(1, "Equestre", "Cabalgata al atardecer", 20000);
        Tour tour2 = new Tour(2, "Aventura", "Canopy", 30000);
        Tour tour3 = new Tour(3, "Gastronómico", "La ruta del kuchen", 50000);
        Tour tour4 = new Tour(4,"Aventura", "Rafting", 85000);
        Tour tour5 = new Tour(5, "Equestre", "Cabalgata al amanecer", 20000);

        //Ruta del archivo de texto
        String rutaArchivo = "resources/tours.txt";

        //Se crea un objeto de la clase GestorDatos.
        GestorDatos gestor = new GestorDatos();

        //Se crea la lista de tours desde el archivo.
        ArrayList<Tour> listaTours = new ArrayList<>();

        //Metodo add para agregar tour1 a la lista.
        listaTours.add(tour1);
        listaTours.add(tour2);
        listaTours.add(tour3);
        listaTours.add(tour4);
        listaTours.add(tour5);

        //Se guardan los datos en el archivo.
        gestor.guardarTours(rutaArchivo, listaTours,  false);

        //Se carga la lista de tours desde el archivo.
        ArrayList<Tour> tours = gestor.cargarTours(rutaArchivo);

        //Mostrar catálogo de tours
        System.out.println("\n" +
                            "=== CATÁLOGO LLANQUIHUE TOURS ===" +
                            "\n");
        //Recorrer una lista de tours (objetos).
        for (Tour tour : tours) {
            System.out.println(tour);
        }
        //Filtro para tours equestres
        System.out.println("\n--- Tours Equestres ---");
        for (Tour tour : tours) {
            if(tour.getTipoTour().equalsIgnoreCase("Equestre")) {
                System.out.println(tour);
            }
        }

        //Filtro para tours de aventura
        System.out.println("\n---Tours Aventura ---");
        for (Tour tour : tours) {
            if(tour.getTipoTour().equalsIgnoreCase("Aventura")) {
                System.out.println(tour);
            }
        }
        //Filtro para tours de Gastronómico
        System.out.println("\n---Tours Gastronómicos ---");
        for (Tour tour : tours) {
            if(tour.getTipoTour().equalsIgnoreCase("Gastronómico")) {
                System.out.println(tour);
            }
        }

    }
}