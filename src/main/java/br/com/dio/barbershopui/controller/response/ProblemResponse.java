package br.com.dio.barbershopui.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public record ProblemResponse(
        @JsonProperty("status") Integer status,
        @JsonProperty("timestamp") OffsetDateTime timestamp,
        @JsonProperty("message") String message
) {

    public static class Builder {
        private Integer status;
        private OffsetDateTime timestamp = OffsetDateTime.now();  // Default value
        private String message;

        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public ProblemResponse build() {
            return new ProblemResponse(status, timestamp, message);
        }
    }

    // Static method to provide access to the Builder
    public static Builder builder() {
        return new Builder();
    }
}
