package org.example.citasclinicas;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class GestionCitasTest {
    private final GestionCitas gestion = new GestionCitas();

    @Test
    void testAgendarCitaExitosa() {
        Cita cita = new Cita("Juan Perez", "Dr. House", LocalDateTime.of(2023, 10, 20, 10, 0));
        gestion.agendarCita(cita);
        assertEquals(1, gestion.obtenerTotalCitas());
    }

    @Test
    void testErrorCitaDuplicada() {
        LocalDateTime hora = LocalDateTime.of(2023, 10, 20, 15, 0);
        Cita cita1 = new Cita("Paciente A", "Dr. Strange", hora);
        Cita cita2 = new Cita("Paciente B", "Dr. Strange", hora);

        gestion.agendarCita(cita1);

        // Verifica que falle si el médico y hora coinciden
        assertThrows(IllegalStateException.class, () -> {
            gestion.agendarCita(cita2);
        });
    }
}