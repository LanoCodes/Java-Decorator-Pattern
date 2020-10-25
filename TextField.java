//Delano Powell

//This is the core class. aka, the middle of the wrapper
public class TextField implements Widget {

    public int width;
    public int height;

    public TextField(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("This is TextField with values of " +
                height + " and " + width );
    }
}
