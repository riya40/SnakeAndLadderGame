package com.bridgelabz.snakeladdergame;

public class SnakeAndLadder {
    public static void main(String args[]) {
        int p = 0,pos = 0;
        int c = (int) Math.floor(Math.random() * 10) % 2;
        System.out.println("not start yet:"+c);
        int p1=(int) Math.floor(Math.random() * 10) % 5+1;

        int user = (int) Math.floor(Math.random() * 10) % 2;
        if(user==1){

          if(c == 0) {        //player start at 0 position
            System.out.println("we start it now");
            //rolling the dice to get the number and showing the position

            while (pos <= 100) {//repeating the process until reach to 100 position
                p = (int) Math.floor(Math.random() * 10) % 5 + 1;//dice roll to get number using random function
                System.out.println("dice rolled:" + p);
                pos += p;
                System.out.println("current position:" + pos);

                //for the ladder and snake positions
                int sw = (int) Math.floor(Math.random() * 10) % 3 + 1;
                System.out.println("benifits:" + sw);

                switch (sw) {

                    case 1:
                        System.out.println("no play");
                        break;
                    case 2:
                        System.out.println("the ladder appeared" + p1);
                        p += p1;
                        System.out.println("the ladder appeared:" + p);
                        break;
                    case 3:
                        System.out.println("the snake appeared" + p1);
                        p -= p1;
                        System.out.println("the snake appeared" + p);
                        break;
                    default:
                        System.out.println("no change");
                        break;
                }
                if (pos <= 100) {
                    pos += p;
                    System.out.println("current position:" + pos);
                }
                else if (pos == 100) {
                    break;
                }
                else if (pos > 100) {
                    pos -= p;
                    break;
                } else {
                    break;
                }
            }
          }
        }
    }

}
