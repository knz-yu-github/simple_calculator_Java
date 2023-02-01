package keisan;

import mainfolder.SuperClass;

//https://talavax.com/math-cd.html

public class Yakusuu extends SuperClass{

    private int num1;
    private int num2;
    
    public Yakusuu(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //公約数
    @Override
    public int yakusuu(){
        
        // 変数を宣言
        int temp;

        while((temp = num1%num2)!=0) {
            num1 = num2;
            num2 = temp;
        }
        return num2;
    }
    }
