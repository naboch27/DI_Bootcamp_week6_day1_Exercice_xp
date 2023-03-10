/**
 * Circle
 */
public class Circle {

    private double radius;

    private String color;

    public Circle() {
    }

    public Circle(double radius) {

        this.radius = radius;

    }

    public Circle(double radius, String color) {

        this.radius = radius;

        this.color = color;

    }

    public double getRadius() {

        return radius;

    }

    public void setRadius(double radius) {

        this.radius = radius;

    }

    public String getColor() {

        return color;

    }

    public void setColor(String color) {

        this.color = color;

    }

    @Override
    public String toString() {

        return "Circle [radius=" + radius + ", color=" + color + "]";

    }

    public String getArea() {

        return "Circle [radius=" + radius + ", color=" + color + "]";

    }

    public static void main(String[] args) {

        Circle circle = new Circle();

        circle.setColor("red");

        circle.setRadius(10.0);

        System.out.println("Afficher le rayon et la couleur " + circle.toString());

        System.out.println("Afficher le rayon et la couleur " + circle.getArea());

        System.out.println("Afficher le rayon  " + circle.getRadius());

        System.out.println("Afficher  la couleur " + circle.getColor());

    }

}