//Delano Powell
public abstract class Decorator implements Widget {

    //This is the most important step. It creates an aggregation relationship
    public Widget widget;

    public Decorator(Widget widget){
        this.widget = widget;
    }

    @Override
    public void draw() {
        widget.draw();
    }
}
