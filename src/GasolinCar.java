public class GasolinCar extends AFuelCar{


    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, String fuelType, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, fuelType, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return super.getFuelType();
    }

    @Override
    public int getKmPrLitre() {
        return super.getKmPrLitre();
    }

    @Override
    public int getRegistrationFee() {
        if(getKmPrLitre()>20){
            return 330;
        } else if (getKmPrLitre()>=20 && getKmPrLitre()<=15){
            return 1050;

        } else if (getKmPrLitre()>=14 && getKmPrLitre()<=10){
            return 2340;
        } else if (getKmPrLitre()>=9 && getKmPrLitre()<=5) {
           return 5500;
        } else if (getKmPrLitre()<=4) {
            return 10470;
        }
        return 0;
    }


    @Override
    public String toString() {
        return super.toString()+" [fuel type= "+getFuelType()+ "] [km pr litre= "+getKmPrLitre()+"]";
    }
}
