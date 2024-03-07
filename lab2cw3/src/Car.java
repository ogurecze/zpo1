public class Car {
    public String CarName;
    public int MaxSpeed;

    public Car(String carName, int maxSpeed) {
        CarName = carName;
        MaxSpeed = maxSpeed;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }
}
