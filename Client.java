//Delano Powell
public class Client {

    public static void main(String[] args) {

        //this was indicated as being the basic one?
        Widget widget = new TextField(80, 24);
        widget.draw();

        Widget widget2 = new ScrollDeclarator(new TextField(80, 24));
        widget2.draw();

        Widget  widget3 = new BorderDecorator(new BorderDecorator(new ScrollDeclarator(new TextField(80, 24))));
        widget3.draw();

    }

}
