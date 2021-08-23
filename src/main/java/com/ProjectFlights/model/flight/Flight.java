package com.ProjectFlights.model.flight;

import com.ProjectFlights.model.Aircraft;
import com.ProjectFlights.model.Airline;
import com.ProjectFlights.model.Airport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Flight {
    @Getter
    private int idFlight;
    @Getter
    private String flightNumber;
    @Getter
    private LocalDateTime departureDatetime;
    @Getter
    private LocalDateTime arrivalDatetime;
    @Getter
    private LocalDateTime expectedDatetime;
    @Getter
    private Airport originAirport;
    @Getter
    private Airport destinationAirport;
    @Getter
    private Airline airline;
    @Getter
    private Aircraft aircraftModel;
}
