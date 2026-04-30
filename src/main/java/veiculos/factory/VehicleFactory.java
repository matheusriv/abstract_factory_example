package main.java.veiculos.factory;
import main.java.veiculos.model.IBasicVehicle;
import main.java.veiculos.model.ILuxVehicle;

public interface VehicleFactory {
    ILuxVehicle getLuxVehicle();
    IBasicVehicle getBasicVehicle();
}