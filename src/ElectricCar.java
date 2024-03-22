public class ElectricCar extends ACar{
    private int batteryCapacity;
    private int maxRange;


    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors,int batteryCapacity,int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRange() {
        return maxRange;
    }
    public float getWhPrKm(){
        return (float) (batteryCapacity*1000) / maxRange;
    }
    public float convert(){
        return (9125f/getWhPrKm());
    }

    @Override
    public int getRegistrationFee() {
        if(convert()>20){
            return 330;
        } else if (convert()>=20){
            return 1050;
        } else if (convert()>=14){
            return 2340;
        } else if (convert()>=9) {
            return 5500;
        } else if (convert()<=4) {
            return 10470;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+" [Max range= "+getMaxRange()+"] [Battery capacity= "+getBatteryCapacityKWh()+"] [Wh/km= "+getWhPrKm()+"]";
    }
}
