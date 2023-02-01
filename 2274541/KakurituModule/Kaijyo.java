package KakurituModule;

import java.math.BigDecimal;

import mainfolder.SuperClass;

public class Kaijyo extends SuperClass{

    public static BigDecimal kaijyo(BigDecimal num){

        //計算をすべてBigDecimalにさせる準備

        BigDecimal big1 = num;

        BigDecimal n = new BigDecimal(0);
        BigDecimal inc = new BigDecimal(1);
        BigDecimal result = new BigDecimal(1);

        while(true){

            n = n.add(inc);
            //System.out.println(n);

            result = result.multiply(n);
            //System.out.println(result);

            if(n.equals(big1)){
                return result;
            }
        }

    }
}

