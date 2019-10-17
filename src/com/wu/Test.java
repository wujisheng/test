package com.wu;
import com.tan.TanY;

public class Test {

    public static void main(String[] args) {
        TanY tanY = new TanY("覃友谅","女");
        System.out.println("hello world！" + tanY.getName() + "\t" +tanY.getSex());
        tanY.setName("谭有亮");
        System.out.println(tanY.getName());
    }

}
