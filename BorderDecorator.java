//Delano Powell
public class BorderDecorator extends Decorator {


    public BorderDecorator(Widget widget) {
        super(widget);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" BoarderDecorator");
    }

}
