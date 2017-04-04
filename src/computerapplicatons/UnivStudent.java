package computerapplicatons;

/**
 * Created by gyukebox on 2017. 3. 29..
 */
public class UnivStudent extends Person implements PersonAction {
    private double distanceFromHome;
    private double alcoholLimit;
    private Emotion emotion;

    public double getDistanceFromHome() {
        return distanceFromHome;
    }

    public void setDistanceFromHome(double distanceFromHome) {
        this.distanceFromHome = distanceFromHome;
    }

    public double getAlcoholLimit() {
        return alcoholLimit;
    }

    public void setAlcoholLimit(double alcoholLimit) {
        this.alcoholLimit = alcoholLimit;
    }

    public Emotion getEmotion() {
        return emotion;
    }

    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
    }

    public void comeToSchool() {
    }

    public void goHome() {
    }

    public void drinkAlcohol(Alcohol alcohol) {
    }

    public void work(Work work, int time) {
    }

    public void doHomework(Homework hw) {
    }
}
