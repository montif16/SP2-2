public class DieselCar extends AFuelCar{
    private final boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, String fuelType, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, fuelType, kmPrLitre);
        this.particleFilter = particleFilter;
    }


    @Override
    public String getFuelType() {
        return super.getFuelType();
    }

    public int getRegistrationFee() {
        int fee = 0;

        if (!hasParticleFilter()) {
            fee = 1000;
        }

        if (getKmPrLitre() >= 20) {
            return 130 + fee;
        } else if (getKmPrLitre() >= 16) {
            return 1390 + fee;
        } else if (getKmPrLitre() >= 11) {
            return 1860 + fee;
        } else if (getKmPrLitre() >= 6) {
            return 2770 + fee;
        } else {
            return 15260 + fee;
        }
    }

    public boolean hasParticleFilter() {

        return particleFilter;
    }

    @Override
    public String toString() {
        return super.toString()+" [fuel type= "+getFuelType()+ "] [km pr litre= "+getKmPrLitre()+"] [Particle filter installed= "+hasParticleFilter()+"]";
    }
}
