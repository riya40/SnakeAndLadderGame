package com.bridgelabz.snakeladdergame;

public class SnakeAndLadder {
    public static void main(String args[]) {
        int p=0,pos=0;
        int c=(int) Math.floor(Math.random() * 10) % 2;
        System.out.println("not start yet:"+c);

        if(c==0) {		//player start at 0 position
            System.out.println("we start it now");
            for(int i=0;i<6;i++) {
                p=(int) Math.floor(Math.random() * 10) % 5+1;//dice roll to get number
                System.out.println("dice rolled:"+p);
                pos+=p;
                System.out.println("current position:"+pos );
            }

        }
    }

}