import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width ,height;
        width = 25;
        height = 30;
        float area = width*height;
        float Perimeter = 2*(width+height);

        System.out.println(area +"\n"+ Perimeter);
    }
}
