package LAB3_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PacienteCollection {

    private List<Paciente> pacientes = new ArrayList<>();

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public Iterator<Paciente> iterator() {
        return new PacienteIterator(pacientes);
    }
}
