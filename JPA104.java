import java.util.Scanner;
public class JPA104{
    public static void main(String[] args) {
        Scanner beio = new Scanner(System.in);//宣告beio為輸入清單
        
        System.out.println("輸入第1組的x和y座標");
        double x1 = beio.nextDouble();
        double y1 = beio.nextDouble();
        
        System.out.println("輸入第2組的x和y座標:");
        double x2 = beio.nextDouble();
        double y2 = beio.nextDouble();
        
        double total =Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));//使用Math模組計算座標位置--(x1-x2)**2+(y1-y2)**2開根號
        System.out.printf("介於<%.2f,%.2f>和<%.2f,%.2f>之間的距離是%.2f",x1,y1,x2,y2,total); //輸出結果
        beio.close();
    }
}