package smallsa;

public class Circle extends Graphical{
    private double radius;

    public Circle() {
        this.setName("圆");
    }
    public Circle(double radius){
        this.setName("圆");
        this.radius =radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        System.out.println("name=" + this.getName());
        return Math.PI * radius * radius;
    }
}
