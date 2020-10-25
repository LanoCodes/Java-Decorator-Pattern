//Delano Powell
public class ScrollDeclarator extends Decorator{


    public ScrollDeclarator(Widget widget) {
        super(widget);
    }

    @Override
    public void draw() {

        super.draw();
        System.out.println(" ScrollDecorator");
    }
}
