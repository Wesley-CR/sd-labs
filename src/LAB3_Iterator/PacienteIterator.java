package LAB3_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PacienteIterator implements Iterator<Paciente> {

    private List<Paciente> pacientes;
    private int posicion = 0;

    public PacienteIterator(List<Paciente> pacientesOriginales) {
        pacientes = new ArrayList<>(pacientesOriginales);
        pacientes.sort((a, b) -> {
            int prioridadA = obtenerValor(a.getPrioridad());
            int prioridadB = obtenerValor(b.getPrioridad());
            if (prioridadA != prioridadB) {
                return prioridadA - prioridadB;
            }
            return a.getOrdenLlegada() - b.getOrdenLlegada();
        });
    }

    private int obtenerValor(Prioridad prioridad) {
        switch (prioridad) {
            case ROJO:     return 1;
            case AMARILLO: return 2;
            case VERDE:    return 3;
            default:       return 999;
        }
    }

    @Override
    public boolean hasNext() {
        return posicion < pacientes.size();
    }

    @Override
    public Paciente next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException("No hay más pacientes en la cola.");
        }
        return pacientes.get(posicion++);
    }
}
