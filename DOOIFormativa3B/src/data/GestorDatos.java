package data;

import model.Tour;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase que representa al gestor de datos, encargada de leer
 * los datos desde un archivo de texto.
 */

public class GestorDatos {

    /**
     * Constructor de la clase GestorDatos
     * @param rutaCatalogo es la ruta del archivo del catálogo de tours.
     * @return retorna la lista de tours.
     */
    //Metodo que recibe la ruta del archivo y retorna la lista de tours.
    public ArrayList<Tour> cargarTours(String rutaCatalogo) {

        //Lista dinámica donde se almacenarán los tours
        ArrayList<Tour> listaTours = new ArrayList<>();

        try {
            //Apertura del archivo para la lectura.
            BufferedReader lector = new BufferedReader(new FileReader(rutaCatalogo));

            //Lectura línea por línea
            String linea;

            //Lectura del archivo línea por línea.
            while ((linea = lector.readLine()) != null) {

                //Se separa la línea usando split (;)
                String[] partes = linea.split(";");

                //Se valida que la línea tenga 4 datos.
                if (partes.length == 4) {

                    //Se convierten los datos al formato entregado.
                    int id = Integer.parseInt(partes[0]);
                    String tipoTour = partes[1];
                    String nombreTitulo = partes[2];
                    double precio = Double.parseDouble(partes[3]);

                    //Se crea un objeto Tour con los datos leídos.
                    Tour tour = new Tour(id, tipoTour, nombreTitulo, precio);

                    //Se captura el objeto a la salida.
                    listaTours.add(tour);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        //Se retorna la lista con los tours cargados
        return listaTours;
    }
        public void guardarTours (String rutaArchivo, ArrayList < Tour > listaTours,boolean apend) {
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo, apend))) {
                //Recorre la lista y escribe cada tour
                for (Tour t : listaTours) {
                    String linea = t.getIdTour() + ";" + t.getTipoTour() + ";" + t.getNombreTour() + ";" + t.getPrecio();
                    escritor.write(linea);
                    escritor.newLine();
                }

                //Cierre del escritor
                escritor.close();

                System.out.println("Datos guardados correctamente en " + rutaArchivo);
            } catch (IOException e) {
                System.out.println("Error al guardar datos: " + e.getMessage());
            }
        }

    }
