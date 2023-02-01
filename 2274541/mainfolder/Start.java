package mainfolder;

import keisan.*;

import java.math.BigDecimal;
import java.util.Scanner;

import KakurituModule.*;

public class Start {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("-----いろいろ計算機へようこそ-----");
        System.out.println("-ここでは様々な計算ができます！-");
        boolean flag = true;
        while (flag){
            
            System.out.print("確認したらEnterを入力してください:");
            stdIn.nextLine();

            System.out.println("");//\n
            System.out.println("--------------------------------------------------------");
            System.out.println("+|四則演算 --> 1");
            System.out.println("+|最小公倍数 --> 2");
            System.out.println("+|最大公約数 --> 3");
            System.out.println("+|階乗 --> 4");
            System.out.println("+|累乗 --> 5");
            System.out.println("+|確率 --↓");
            System.out.println("-->+|〇通り(nCr) --> 6");
            System.out.println("--(赤-青 == 青-赤) 1種類");
            System.out.println("--------------------------");
            System.out.println("-->+|並び方(nPr) --> 7");
            System.out.println("--(赤-青 != 青-赤) 2種類");
            System.out.println("--------------------------");
            System.out.println("*|終了 --> 10");
            
            System.out.println("--------------------------------------------------------");
            System.out.println("");//\n
            System.out.print("入力してください:");

            String select = stdIn.nextLine();

            double num1;
            double num2;

            switch (select){

                case "1":
                    try {
                        System.out.println("数値1 四則記号 数値2 の順番に入力(整数以外も対応)");

                        System.out.print("数値1:");
                        num1 = Double.parseDouble(stdIn.nextLine());

                        System.out.print("四則記号:");
                        String kigo = stdIn.nextLine();

                        System.out.print("数値2:");
                        num2 = Double.parseDouble(stdIn.nextLine());

                        Sisokuenzan se = new Sisokuenzan(num1,kigo,num2);

                        System.out.println("結果:"+se.sisokuenzan());
                    } catch (Exception e) {

                        System.out.println("不正な入力です");

                    }

                break;
                
                case "2":
                    try {
                        System.out.println("整数1 整数2の最小公倍数を求めるよ");
                        System.out.print("整数1:");
                        num1 = stdIn.nextInt();
                        stdIn.nextLine(); //nextInt->Line挙動の対処 https://qiita.com/circular/items/900f654a7adbe19cc9ae

                        System.out.print("整数2:");
                        num2 = stdIn.nextInt();
                        stdIn.nextLine(); //nextInt->Line挙動の対処 https://qiita.com/circular/items/900f654a7adbe19cc9ae

                        Baisuu bi = new Baisuu((int)num1,(int)num2);
                        System.out.println("結果:"+bi.baisuu());
                    } catch (Exception e) {

                        System.out.println("不正な入力です");
                        stdIn.nextLine(); //nextInt->Line挙動の対処 https://qiita.com/circular/items/900f654a7adbe19cc9ae
                    }
                break;

                case "3":
                    try {
                        System.out.println("整数1 整数2の最大公約数を求めるよ");
                        System.out.print("整数1:");
                        num1 = stdIn.nextInt();
                        stdIn.nextLine(); //nextInt->Line挙動の対処 https://qiita.com/circular/items/900f654a7adbe19cc9ae

                        System.out.print("整数2:");
                        num2 = stdIn.nextInt();
                        stdIn.nextLine(); //nextInt->Line挙動の対処 https://qiita.com/circular/items/900f654a7adbe19cc9ae

                        Yakusuu yk = new Yakusuu((int)num1,(int)num2);
                        System.out.println("結果:"+yk.yakusuu());
                        
                    } catch (Exception e) {
                        System.out.println("不正な入力です");
                        stdIn.nextLine(); //nextInt->Line挙動の対処 https://qiita.com/circular/items/900f654a7adbe19cc9ae

                    }
                break;

                case "4":
                    try {
                        System.out.println("整数1の階乗を求めるよ");
                        System.out.print("整数1:");
                        num1 = stdIn.nextInt();
                        stdIn.nextLine(); //nextInt->Line挙動の対処 https://qiita.com/circular/items/900f654a7adbe19cc9ae

                        Kaijyo kj = new Kaijyo();
                        BigDecimal big1 = new BigDecimal((int)num1);
                        System.out.println("結果:"+kj.kaijyo(big1));
                        
                    } catch (Exception e) {

                        System.out.println("不正な入力です");
                        stdIn.nextLine(); //nextInt->Line挙動の対処 https://qiita.com/circular/items/900f654a7adbe19cc9ae
                    }
                    break;

                    case "5":
                    try {
                        System.out.println("整数1の指数で累乗を求めるよ");
                        System.out.print("整数1:");
                        num1 = stdIn.nextInt();
                        stdIn.nextLine(); //nextInt->Line挙動の対処 https://qiita.com/circular/items/900f654a7adbe19cc9ae

                        System.out.print("指数:");
                        num2 = stdIn.nextInt();
                        stdIn.nextLine(); //nextInt->Line挙動の対処 https://qiita.com/circular/items/900f654a7adbe19cc9ae

                        Ruijyo ru = new Ruijyo((int)num1,(int)num2);

                        System.out.println("結果:"+ru.ruijyo());
                        
                    } catch (Exception e) {

                        System.out.println("不正な入力です");
                        stdIn.nextLine(); //nextInt->Line挙動の対処 https://qiita.com/circular/items/900f654a7adbe19cc9ae
                    }

                break;

                case "6":
                    try {
                        System.out.println("");
                        System.out.println("〇個の中から〇個の組み合わせを求めます");
                        System.out.println("(例)[1,2,3]から2個 = [1,2][1,3][2,3](3通り)");
                        System.out.print("整数1:");
                        num1 = stdIn.nextInt();
                        stdIn.nextLine(); //nextInt->Line挙動の対処 https://qiita.com/circular/items/900f654a7adbe19cc9ae

                        System.out.print("整数2:");
                        num2 = stdIn.nextInt();
                        stdIn.nextLine(); //nextInt->Line挙動の対処 https://qiita.com/circular/items/900f654a7adbe19cc9ae

                        Kaijyo k3 = new Kaijyo();
                        Kaijyo k4 = new Kaijyo();
                        Kaijyo k5 = new Kaijyo();

                        if (num1 > num2){
                                        // 10     3
                            double num3 = num1 - num2;
                            BigDecimal big2 = new BigDecimal(num1); //3*2*1 6
                            //System.out.println(k3.kaijyo(big2));
                            BigDecimal big3 = new BigDecimal(num3); //10-3 7*6*5*4*3*2*1 5040 / 6 
                            //System.out.println(k4.kaijyo(big3));

                            BigDecimal big4 = new BigDecimal(num2); //3*2*1 6
                            big4 = k5.kaijyo(big4);

                            BigDecimal big5 = new BigDecimal(0);

                            big5 = k3.kaijyo(big2).divide(k4.kaijyo(big3));

                            System.out.println("結果:"+big5.divide(big4)+"通り");

                        }else{
                            System.out.println("Error");
                        }
                        
                    } catch (Exception e) {

                        System.out.println("不正な入力です");
                        stdIn.nextLine(); //nextInt->Line挙動の対処 https://qiita.com/circular/items/900f654a7adbe19cc9ae

                    }
                break;

                case "7":
                    try {
                        System.out.println("");
                        System.out.println("〇個の中から〇個選んだ時の通りを求めます");
                        System.out.println("(例)[1,2,3]から2個 = [1,2][2,1][1,3][3,1][2,3][2,3](6通り)");
                        System.out.print("整数1:");
                        num1 = stdIn.nextInt();
                        stdIn.nextLine(); //nextInt->Line挙動の対処 https://qiita.com/circular/items/900f654a7adbe19cc9ae

                        System.out.print("整数2:");
                        num2 = stdIn.nextInt();
                        stdIn.nextLine(); //nextInt->Line挙動の対処 https://qiita.com/circular/items/900f654a7adbe19cc9ae

                        Kaijyo k1 = new Kaijyo();
                        Kaijyo k2 = new Kaijyo();

                        if (num1 > num2){
                                        // 10     3
                            double num3 = num1 - num2;
                            BigDecimal big2 = new BigDecimal(num1); //3*2*1 6
                            //System.out.println(k1.kaijyo(big2));
                            BigDecimal big3 = new BigDecimal(num3); //10-3 7*6*5*4*3*2*1 5040 / 6 
                            //System.out.println(k2.kaijyo(big3));

                            System.out.println("結果:"+k1.kaijyo(big2).divide(k2.kaijyo(big3))+"通り");

                        }else{
                            System.out.println("Error");
                        }
                        
                    } catch (Exception e) {

                        System.out.println("不正な入力です");
                        stdIn.nextLine(); //nextInt->Line挙動の対処 https://qiita.com/circular/items/900f654a7adbe19cc9ae
                    }
                break;

                case "10":
                    flag = false;
                    System.out.println("終了します");
                break;
                
                default:
                System.out.println("選択した値が不正でした");

            }//switch
        
        }//while

    }//main

}//class



/*
 * 継承すると継承したクラスのメソッドも使える
 * interfaceに描いたものは必ず実装(implements)
 * abstract抽象クラスはインスタンス化できない
 * 無理やりが多いあまりよくないコード
 */