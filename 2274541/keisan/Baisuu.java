package keisan;

import mainfolder.SuperClass;

//https://lovedvoraklayout.hatenablog.com/entry/java-euclidean-algorithm

public class Baisuu extends SuperClass{
    
    //最小公倍数baisuu
    //field
    private int num1;
    private int num2;

    //constractor
    public Baisuu(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public int baisuu(){

        int tmp;
        long c = num1;
        c *= num2;
        while((tmp = num1%num2)!=0) {
            num1 = num2;
            num2 = tmp;
        }
        return (int)(c/num2);
    }
    
}
