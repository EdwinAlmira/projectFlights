package com.ProjectFlights.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Airport {

    @Getter
    private int idAirport;
    @Getter
    private String name;
    @Getter
    private String country;
    @Getter
    private String city;

}
