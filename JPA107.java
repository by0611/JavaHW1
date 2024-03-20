public class JPA107_2 {
    public static void main(String argv[]) {//argv為參數可選的數組
        int action = 1, skill = 2, teamgame = 3;//設置三個變數

        System.out.println("The basketball grade is " + Basketball.cal(action, skill, teamgame));//輸出並呼叫函數，與其對應的數值，例如a對應的為action。
        System.out.println("The baseball grade is " + Baseball.cal(skill, teamgame));//輸出並呼叫函數，與其對應的數值
    }
}

class Basketball { //定義籃球類別
    public static int cal(int a, int s, int t) {//定義cal函數，*cal為函數名稱，沒有任何意義。
        return a + s + t;//回傳計算值
    }
}

class Baseball {//定義棒球類別
    public static int cal(int s, int t) {//定義cal函數
        return 10 + s + t;//回傳計算值
    }
