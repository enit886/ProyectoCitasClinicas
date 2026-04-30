package org.example.citasclinicas;

import java.time.LocalDateTime;

public class Cita {
    private String paciente;
    private String medico;
    private LocalDateTime fechaHora;

    public Cita(String paciente, String medico, LocalDateTime fechaHora) {
        // REFACTOR: Validación de nombre no vacío
        if (paciente == null || paciente.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del paciente es obligatorio");
        }
        this.paciente = paciente;
        this.medico = medico;
        this.fechaHora = fechaHora;
    }

    public String getMedico() { return medico; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public String getPaciente() { return paciente; }
}