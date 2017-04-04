package computerapplicatons;

import java.awt.*;
import java.io.File;

/**
 * Created by gyukebox on 2017. 3. 29..
 */
public class Emotion {
    private File imageSource;
    private Image image;
    private int stat;

    public File getImageSource() {
        return imageSource;
    }

    public void setImageSource(File imageSource) {
        this.imageSource = imageSource;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getStat() {
        return stat;
    }

    public void setStat(int stat) {
        this.stat = stat;
    }
}
