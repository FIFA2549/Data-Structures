public class Maim {
    public static void main(String[] args) {
        Circle circle = new Circle(0);
        circle.setRadian(15);
        System.out.println("The area of the circle is now " + circle.getArea());
        System.out.println("The perimeter of the circle is now " + circle.getPerimeter());
    }
}
