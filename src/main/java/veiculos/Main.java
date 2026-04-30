package main.java.veiculos;

import main.java.veiculos.factory.*;
import main.java.veiculos.model.*;

public class Main {
    public static void main(String[] args) {
        // Usando a Fábrica Principal (Main)
        VehicleFactory mainFactory = new MainVehicleFactory();
        ILuxVehicle luxMain = mainFactory.getLuxVehicle();
        IBasicVehicle basicMain = mainFactory.getBasicVehicle();
        
        luxMain.drive();   // Saída: Dirigindo Carro de Luxo (Main)
        basicMain.drive(); // Saída: Dirigindo Carro Básico (Main)

        System.out.println("---");

        // Usando a Fábrica de Filial (Branch)
        VehicleFactory branchFactory = new BranchVehicleFactory();
        ILuxVehicle luxBranch = branchFactory.getLuxVehicle();
        IBasicVehicle basicBranch = branchFactory.getBasicVehicle();
        
        luxBranch.drive();   // Saída: Dirigindo Carro de Luxo (Branch)
        basicBranch.drive(); // Saída: Dirigindo Carro Básico (Branch)
    }
}
