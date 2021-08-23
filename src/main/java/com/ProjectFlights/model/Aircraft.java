package com.ProjectFlights.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Aircraft {
    @Getter
    private int idAircraft;
    @Getter
    private String model;
    @Getter
    private int passengerCapacity;
    @Getter
    private double rangeFullTank;
}
