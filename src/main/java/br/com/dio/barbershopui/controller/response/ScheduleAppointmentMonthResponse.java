package br.com.dio.barbershopui.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.List;

public record ScheduleAppointmentMonthResponse(
        @JsonProperty("year")
        Integer year,
        @JsonProperty("month")
        Integer month,

        List<ClientScheduleAppointmentResponse> ScheduledAppointments

) {
}
