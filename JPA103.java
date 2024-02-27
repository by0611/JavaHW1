import java.util.Scanner;
public class JPA103{   
    public static void main(String[] args) {
        Scanner total = new Scanner(System.in);
        System.out.println("Please input: ");
        int num1 = total.nextInt();//將三個值輸入
        int num2 = total.nextInt();
        int num3 = total.nextInt();
        double average = (num1 + num2 + num3) / 3.0;
        System.out.printf("Average: %.2f",average);//pirntf為格式化輸出
        total.close();
    }

}
