import java.util.List;
import java.util.logging.Logger;

public class Presentation {

    private static final Logger logger = Logger.getLogger("");

    private final SlideDeck slideDeck;

    public Presentation(SlideDeck slideDeck) {
        this.slideDeck = slideDeck;
    }

    public void present(PresentationDevice device) {
        for (Slide slide : slideDeck.slides()) {
            device.show(slide);
        }
    }
}
