import java.util.Scanner;
public class JPA105 {
    public static void main(String[] args) {
       Scanner key = new Scanner(System.in);
       System.out.println("請輸入你的姓名");
       String name;
       name = key.nextLine();
       System.out.println("Hi, "+name+",請輸入您的銅板的個數");
       
       System.out.println("請輸入1元的數量:");//11,12行可以所減成int one_coin = key.nextInt(),為了方便學習，先分兩行寫
       int one_coin;
       one_coin = key.nextInt();

       System.out.println("請輸入5元的數量:");
       int five_coin;
       five_coin = key.nextInt();

       System.out.println("請輸入10元的數量:");
       int ten_coin;
       ten_coin = key.nextInt();

       System.out.println("請輸入50元的數量:");
       int fifty_coin;
       fifty_coin = key.nextInt();

       int total;//運算
       total = one_coin + (five_coin)*5 + (ten_coin)*10 + (fifty_coin)*50;

       int a = total/1000;//先將tital取千位數並消除餘數
       total %= 1000;//再取total的餘數以此消除千位數，ex:2500 %=1000 ==> 500
       int b = total/100;
       total %= 100;
       int c = total/10;
       total %= 10;
       int d = total;
       System.out.printf("您的錢總共有:%d 千 %d 百 %d 十 %d 元",a,b,c,d);
       key.close();	
    }
}
