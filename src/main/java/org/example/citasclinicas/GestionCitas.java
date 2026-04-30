package org.example.citasclinicas;

import java.util.ArrayList;
import java.util.List;

public class GestionCitas {
    private List<Cita> citas = new ArrayList<>();

    public void agendarCita(Cita nuevaCita) {
        for (Cita cita : citas) {
            // Regla: No mismo médico a la misma hora
            if (cita.getMedico().equals(nuevaCita.getMedico()) &&
                    cita.getFechaHora().equals(nuevaCita.getFechaHora())) {
                throw new IllegalStateException("El médico ya tiene una cita a esa hora");
            }
        }
        citas.add(nuevaCita);
    }

    public int obtenerTotalCitas() {
        return citas.size();
    }
}