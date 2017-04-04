package computerapplicatons;

/**
 * Created by gyukebox on 2017. 3. 31..
 */
public class Meal extends Food {
    private String mealType;
    private double calorie;

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }
}
