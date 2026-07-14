import java.util.Scanner;

public class review {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Created by 680710140 Phumet Boonprakobporn");
        int n = sc.nextInt();
        float sum = 0;
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if(k%2!=0){
                continue;
            }else{
                sum+=k;
            }
        }
        System.out.printf("%.2f",sum/n);
    }

}