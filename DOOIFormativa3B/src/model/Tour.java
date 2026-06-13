package model;

/**
 * Clase que representa un tour.
 * Incluye identificación, tipo de tour y precio.
 */

public class Tour {

    //Atributos de la clase tour.
    private int idTour;
    private String tipoTour;
    private String nombreTour;
    private double precio;

    //Constructor vacío
    public Tour() {
        this.idTour = 1;
        this.tipoTour = "tipo de tour";
        this.nombreTour = "nombre del tour";
        this.precio = 10000;
    }

    /**
     * Contructor de la clase Tour
     * @param idTour identificación del tour.
     * @param tipoTour tipo de tour.
     * @param nombreTour nombre del tour.
     * @param precio precio del tour.
     */

    //Constructor con parámetros
    public Tour(int idTour, String tipoTour, String nombreTour, double precio) {
        this.idTour = idTour;
        this.tipoTour = tipoTour;
        this.nombreTour = nombreTour;
        this.precio = precio;
    }

    //Métodos getter
    public int getIdTour() {
        return idTour;
    }

    public String getTipoTour() {
        return tipoTour;
    }

    public String getNombreTour() {
        return nombreTour;
    }

    public double getPrecio() {
        return precio;
    }

    //Métodos setter
    public void setIdTour(int idTour) {
        this.idTour = idTour;
    }

    public void setTipoTour(String tipoTour) {
        this.tipoTour = tipoTour;
    }

    public void setNombreTour(String nombreTour) {
        this.nombreTour = nombreTour;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodo toString para mostrar la información del tour
    @Override
    public String toString() {
        return "N°: " + idTour +
                "| Tipo de Tour: " + tipoTour +
                "| Nombre del Tour: " + nombreTour +
                "| Precio: $" + precio;
    }
}
