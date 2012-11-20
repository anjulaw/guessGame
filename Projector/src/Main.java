import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Slide slide1 = new Slide("Slide1");
        Slide slide2 = new Slide("Slide2");

        SlideDeck slideDeck = new SlideDeck(slide1, slide2);

        Presentation presentation = new Presentation(slideDeck);

        List<PresentationDevice> allDevices = new ArrayList<>();
        allDevices.add(new ProjectorAdapter(new Projector()));
        allDevices.add(new TvAdapter(new Tv()));
        allDevices.add(new ProjectorAdapter(new Projector()));
        allDevices.add(new TvAdapter(new Tv()));
        allDevices.add(new ProjectorAdapter(new Projector()));
        allDevices.add(new ProjectorAdapter(new Projector()));
        allDevices.add(new TvAdapter(new Tv()));

        for (PresentationDevice currentDevice : allDevices) {
            presentation.present(currentDevice);
        }
    }
}

