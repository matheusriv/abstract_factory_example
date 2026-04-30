package main.java.veiculos.factory;
import main.java.veiculos.model.*;

//Fábrica para a linha "Branch"
public class BranchVehicleFactory implements VehicleFactory {
	@Override
	public ILuxVehicle getLuxVehicle() {
		return new CarLuxBranch();
	}

	@Override
	public IBasicVehicle getBasicVehicle() {
		return new CarBasicBranch();
	}
}