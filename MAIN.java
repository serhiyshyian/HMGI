package shapes;

public class MAIN {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape quad = new Quad(10.0);
        Shape triangle = new Triangle(8.0, 4.0);
        Shape rectangle = new Rectangle(6.0, 3.0);
        Shape square = new Square(7.0);


        ShapePrinter.printShapeName(circle);
        ShapePrinter.printShapeName(quad);
        ShapePrinter.printShapeName(triangle);
        ShapePrinter.printShapeName(rectangle);
        ShapePrinter.printShapeName(square);
    }
}

