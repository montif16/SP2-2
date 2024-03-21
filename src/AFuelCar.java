public abstract class AFuelCar extends ACar{
    private int kmPrLitre;
    private final String fuelType;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors,String fuelType,int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.fuelType = fuelType;
        this.kmPrLitre = kmPrLitre;
    }

    public String getFuelType(){
        return fuelType;
    }

    public int getKmPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
