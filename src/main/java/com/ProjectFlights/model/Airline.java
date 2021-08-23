package com.ProjectFlights.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Airline {
    @Getter
    private int idAirline;
    @Getter
    private String name;
}
