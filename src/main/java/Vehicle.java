public abstract class Vehicle implements Mobile {

    private int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("My speed is: " + maxSpeed);
    }

}
