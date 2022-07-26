package com.GenSpark.RESTFulApp.Entity;

public class Airplane {

    public int id;
    public String manufacturer;
    public String type;

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Airplane() {
    }

    public Airplane(int id, String manufacturer, String type) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.type = type;
    }
}
