package smallsa;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String inputText= "c";
        Graphical graphical = null;
        //计算圆
        if("y".equals(inputText)){
            System.out.println("请输入圆的半径：");
            Scanner scanner = new Scanner(System.in);
            double radius = scanner.nextDouble();
            graphical = new Circle(radius);
        }
        //计算长方形
        else{
            System.out.println("请输入长方形的长和宽：");
            Scanner scanner = new Scanner(System.in);
            double width = scanner.nextDouble();
            double height = scanner.nextDouble();
            graphical = new Rectangle(width,height);
        }
        System.out.println("面积为："+graphical.getArea());
    }
}
