package LAB3_Iterator;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        PacienteCollection sala = new PacienteCollection();

        // Pacientes registrados en orden de llegada (no de prioridad)
        sala.agregarPaciente(new Paciente("Juan",   Prioridad.VERDE,    1));
        sala.agregarPaciente(new Paciente("Ana",    Prioridad.ROJO,     2));
        sala.agregarPaciente(new Paciente("Pedro",  Prioridad.AMARILLO, 3));
        sala.agregarPaciente(new Paciente("Laura",  Prioridad.ROJO,     4));
        sala.agregarPaciente(new Paciente("Carlos", Prioridad.VERDE,    5));
        sala.agregarPaciente(new Paciente("Maria",  Prioridad.AMARILLO, 6));

        System.out.println("=========================================");
        System.out.println("SALA DE EMERGENCIAS - TEC Hospital");
        System.out.println("=========================================");
        System.out.println("Orden de atención según prioridad:\n");

        Iterator<Paciente> iterator = sala.iterator();
        int turno = 1;
        while (iterator.hasNext()) {
            System.out.println("Turno " + turno++ + ": " + iterator.next());
        }

        System.out.println("\n=========================================");
        System.out.println("Todos los pacientes han sido atendidos.");
        System.out.println("=========================================");
    }
}
