package com.ProjectFlights.model.flights;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Incidents {
    @Getter
    private int idIncident;
    @Getter
    private String details;

    @Getter
    private enum status {STAND_BY, ON_ROUTE, LANDED, DELAYED, CANCELED};

}
