package LAB3_Iterator;
public class Paciente {
    private String nombre;
    private Prioridad prioridad;
    private int ordenLlegada;

    public Paciente(String nombre, Prioridad prioridad, int ordenLlegada) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.ordenLlegada = ordenLlegada;
    }

    public String getNombre() {
        return nombre;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public int getOrdenLlegada() {
        return ordenLlegada;
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre + " - Prioridad: " + prioridad + " - Llegada #" + ordenLlegada;
    }
}
