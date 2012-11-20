/**
* Created with IntelliJ IDEA.
* User: hmspct3
* Date: 7/9/12
* Time: 1:07 PM
* To change this template use File | Settings | File Templates.
*/
public class ProjectorAdapter implements PresentationDevice {

    private final Projector projector;

    public ProjectorAdapter(Projector projector) {
        this.projector = projector;
    }

    @Override
    public void show(Slide slide) {
        projector.project(slide);
    }
}
