package computerapplicatons;

/**
 * Created by gyukebox on 2017. 3. 31..
 */
public abstract class Food {
    private double price;
    private double healthiness;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getHealthiness() {
        return healthiness;
    }

    public void setHealthiness(double healthiness) {
        this.healthiness = healthiness;
    }
}
