import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

/**
 * Created by Adrian on 19.07.2015.
 */
public class Clock {

    private Timeline clock;

    public Clock() {
        clock = new Timeline(new KeyFrame(Duration.millis()))
    }
}
