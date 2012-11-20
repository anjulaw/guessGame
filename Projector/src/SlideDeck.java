import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class SlideDeck {

    List<Slide> slideList = new ArrayList<Slide>();

    public SlideDeck(Slide first, Slide... slide) {
        slideList.add(first);
        slideList.addAll(Arrays.asList(slide));
    }

    public Iterable<Slide> slides() {
        return Collections.unmodifiableList(slideList);
    }
}
