import java.util.ArrayList;

public class FleetOfCars {
    ArrayList <Car> fleet = new ArrayList<>();

    public void addCar(Car car){
        fleet.add(car);
    }
    public int getTotalRegistrationFeeForFleet(){
        int totalCost = 0;
        for (Car car: fleet) {
            totalCost += car.getRegistrationFee();
        }

        return totalCost;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (Car car : fleet){
            sb.append(car.toString()).append("\n");
        }
        return sb.toString();
    }
}
