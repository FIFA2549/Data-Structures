public class Circle {
    public final double Pi = 3.14;
    private double radian;

    public Circle(double radian){
        this.radian = radian;
    }

    public double getRadian(){
        return radian;
    }

    public void setRadian(double radian){
        this.radian = radian;
    }

    public double getArea(){
        return Pi*Math.pow(radian, 2);
    }

    public double getPerimeter(){
        return 2*Pi*radian;
    }
}
