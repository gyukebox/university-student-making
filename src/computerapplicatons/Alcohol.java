package computerapplicatons;

/**
 * Created by gyukebox on 2017. 3. 31..
 */
public class Alcohol extends Drink {
    private double concentration;
    private String name;
    private double price;

    public double getConcentration() {
        return concentration;
    }

    public void setConcentration(double concentration) {
        this.concentration = concentration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
