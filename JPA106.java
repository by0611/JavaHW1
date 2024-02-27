public class JPA106 {
    public static void main(String[] args) {
        System.out.printf("f<-3.2> = %.4f\n",f(-3.2));//前面為格式化輸出，\n代表換行，f(-3.2)為輸入值
		System.out.printf("f<-2.1> = %.4f\n",f(-2.1));//也就是x值(double x)
		System.out.printf("f<0> = %.4f\n",f(0));	
		System.out.printf("f<2.1> = %.4f\n",f(2.1));	
    }
    static double f(double x)//這裡使用ch7的函數運算(java學習函數與引數)，f為函數名稱
    {
        return 3*Math.pow(x,3)+2*x-1;
    }


}
