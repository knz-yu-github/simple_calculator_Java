package keisan;

import mainfolder.SuperClass;

public class Sisokuenzan extends SuperClass{

    //field
    private double num1;
    private String kigo;
    private double num2;

    //constractor
    public Sisokuenzan(double num1, String kigo, double num2) {
        this.num1 = num1;
        this.kigo = kigo;
        this.num2 = num2;
    }
        
    @Override
    public double sisokuenzan(){

        double tmp = 0;

        if (kigo.equals("+")){
            tmp = num1 + num2;
        }else if(kigo.equals("-")){
            tmp = num1 - num2;
        }else if(kigo.equals("*")){
            tmp = num1 * num2;
        }else if(kigo.equals("/")){
            tmp = num1 / num2;
            if(!(Double.isFinite(tmp))){
               System.out.println("0による割り算が行われました。");
               System.out.println("入力を確認してください");
               tmp = 0;
            }
        }else{
            switch(kigo){
                case "+":
                break;
                case "-":
                break;
                case "*":
                break;
                case "/":
                break;
                default:
                //記号が上記以外　のとき
                System.out.print("四則演算記号エラー");
                tmp = 0;
            }
        }

        return tmp;

    }
}

