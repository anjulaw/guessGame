import java.util.logging.Logger;

public class Projector {

    private final Logger logger = Logger.getLogger("");

    public void project(Slide slide) {
        logger.info(slide.content);
    }
}


