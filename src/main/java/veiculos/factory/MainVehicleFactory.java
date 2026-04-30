package main.java.veiculos.factory;
import main.java.veiculos.model.*;

//Fábrica para a linha "Main"
public class MainVehicleFactory implements VehicleFactory {
	@Override
	public ILuxVehicle getLuxVehicle() {
		return new CarLuxMain();
	}

	@Override
	public IBasicVehicle getBasicVehicle() {
			return new CarBasicMain();
	}
}