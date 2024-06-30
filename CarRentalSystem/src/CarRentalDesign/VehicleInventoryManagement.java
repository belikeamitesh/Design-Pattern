package CarRentalDesign;

import CarRentalDesign.Product.Vehicle;

import java.util.List;

public class VehicleInventoryManagement {
    List<Vehicle> vehicles;
    VehicleInventoryManagement(List<Vehicle> vehicles){
        this.vehicles=vehicles;
    }
    public List<Vehicle> getVehicles(){
        return vehicles;
    }
    public void setVehicles(List<Vehicle> vehicles){
        this.vehicles=vehicles;
    }
}
