package smallsa;

public class Rectangle extends Graphical{
    private double width;
    private double height;
    public Rectangle(){
        this.setName("长方形");
    }
    public Rectangle(double width,double height){
        this.setName("长方形");
        this.width = width;
        this.height = height;
    }
    @Override//重载
    public double getArea() {
        System.out.println("name="+this.getName());
        return width*height;
    }
}
