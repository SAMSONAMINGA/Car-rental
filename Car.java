public class Car {
    private String licensePlate;
    private boolean isAvailable;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.isAvailable = true;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
