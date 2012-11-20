import java.util.logging.Logger;


/**
 * Created with IntelliJ IDEA.
 * User: hmspct3
 * Date: 7/6/12
 * Time: 4:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Tv {

    private final Logger logger = Logger.getLogger("");

    public void display(Slide slide) {
        logger.info(slide.content);
    }
}
