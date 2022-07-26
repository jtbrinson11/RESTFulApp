package com.GenSpark.RESTFulApp.Service;

import com.GenSpark.RESTFulApp.Entity.Airplane;

import java.util.List;

public interface AirplaneService {

    List<Airplane> getAllAirplanes();

    Airplane getAirplaneByID(int airID);

    Airplane addAirplane(Airplane plane);

    Airplane updateAirplane(Airplane airplane);

    String deleteAirplaneByID(int airID);
}
