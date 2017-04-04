package computerapplicatons;

/**
 * Created by gyukebox on 2017. 3. 31..
 */
public class Person implements PersonAction {
    private String name;
    private int age;
    private String gender;
    private double accountBalance;

    public void introduceOneself() {
    }

    @Override
    public void eat(Meal meal) {

    }

    @Override
    public void sleep() {

    }

    public void work(Work work, int time) {
    }

    public void drink(Drink drink) {
    }
}
