/**
 * Created with IntelliJ IDEA.
 * User: hmspct3
 * Date: 7/9/12
 * Time: 1:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class TvAdapter implements PresentationDevice {

    private final Tv tv;

    public TvAdapter(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void show(Slide slide) {
        tv.display(slide);
    }
}
