package org.example.citasclinicas;

import java.time.LocalDateTime;

public class Cita {
    private String paciente;
    private String medico;
    private LocalDateTime fechaHora;

    public Cita(String paciente, String medico, LocalDateTime fechaHora) {
        this.paciente = paciente;
        this.medico = medico;
        this.fechaHora = fechaHora;
    }

    // Getters para poder validar la información después
    public String getMedico() {
        return medico;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getPaciente() {
        return paciente;
    }
}