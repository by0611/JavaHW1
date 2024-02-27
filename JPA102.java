import java.util.Scanner;//插入輸入清單模組
public class JPA102 {
    public static void main(String[] args) {
      System.out.println("Please input:");//輸出
      Scanner pow = new Scanner(System.in);//宣告pow為輸入清單
      double kg = pow.nextDouble();//使用double(雙倍精度福點數)
      double Pow = kg * 2.20462;//計算
      System.out.println(kg+" kg = "+Pow+" ponds");//輸出結果
      pow.close();//關閉清單

    }
  }