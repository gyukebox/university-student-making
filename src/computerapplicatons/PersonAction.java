package computerapplicatons;

/**
 * Created by gyukebox on 2017. 3. 31..
 */
public interface PersonAction {
    void introduceOneself();

    void eat(Meal meal);

    void sleep();

    void work(Work work, int time);

    void drink(Drink drink);
}
