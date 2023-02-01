
package KakurituModule;

import mainfolder.SuperClass;

public class Ruijyo extends SuperClass{

    //field
    private int num1;
    private int num2;

    public Ruijyo(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public double ruijyo(){

        double tmp = num1;
        
        if (num2 == 0){
            return 0;
        }else{
            for (int n = 1;n < num2; n++){ //nの1が引数-1までインクリメント
                tmp *= num1; //forの　回数分かける
            }
        }

        return tmp;

    }

}
