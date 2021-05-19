/**
 * TODO FOR HOMEWORK - Rectangle.java
 *      [x] Update this class to inherit from BaseShape.java
 *      [x] Update to a valid and logical constructor
 *      [x] Add a static main method
 */
public class Rectangle extends BaseShape{

    /**
     * TODO FOR HOMEWORK: Update the below constructor
     * Creates an instance of the Rectangle class
     * @param length The length of the rectangle
     * @param height The width of the rectangle
     */
    public Rectangle(double length, double height) {

        super("rectangle", length, height);
    }

    // TODO FOR HOMEWORK: Add a static main method for any debugging purposes

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 4);
        rectangle.DEBUG_PrintOutAreaAndPerimeter();
    }
}
