package model;

public class Tour {

    //Atributos

    public String nombre;
    public String ubicacion;
    public Integer precio;

    public Tour(String nombre, String ubicacion, Integer precio) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        return "\n===== DATOS DEL TOUR =====" +
                "\nNombre: " + nombre +
                "\nUbicacion: " + ubicacion +
                "\nPrecio: " + precio;
    }



}
