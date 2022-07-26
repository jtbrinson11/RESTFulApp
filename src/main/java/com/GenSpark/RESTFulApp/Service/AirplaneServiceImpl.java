package com.GenSpark.RESTFulApp.Service;

import com.GenSpark.RESTFulApp.Entity.Airplane;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirplaneServiceImpl implements AirplaneService{

    List<Airplane> airplaneList;

    public AirplaneServiceImpl() {
        airplaneList = new ArrayList<>();
        airplaneList.add(new Airplane(1, "JT", "Aerobatic"));
        airplaneList.add(new Airplane(2, "Voeing", "Airliner"));
        airplaneList.add(new Airplane(3, "Gumman", "Military"));
    }

    @Override
    public List<Airplane> getAllAirplanes() {
        return airplaneList;
    }

    @Override
    public Airplane getAirplaneByID(int airID) {

        Airplane a = null;
        for (Airplane air : airplaneList)
        {
            if (air.getID() == airID)
            {
                a = air;
                break;
            }
        }

        return a;
    }

    @Override
    public Airplane addAirplane(Airplane plane) {
        airplaneList.add(plane);
        return plane;
    }

    @Override
    public Airplane updateAirplane(Airplane airplane) {
        String manufacturer = airplane.getManufacturer();
        String type = airplane.getType();
        Airplane a = null;
        for (Airplane air : airplaneList)
        {
            if (air.getID() == airplane.getID())
            {
                air.setManufacturer(manufacturer);
                air.setType(type);
                a = air;
                break;
            }
        }
        return a;
    }

    @Override
    public String deleteAirplaneByID(int airID) {

        for (Airplane air : airplaneList)
        {
            if (air.getID() == airID)
            {
                airplaneList.remove(air);
                break;
            }
        }

        return "Deleted airplane";
    }
}
