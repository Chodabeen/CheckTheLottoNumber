package edu.handong.csee.java.H03;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h02();
    }

    void h02() {
      Scanner s = new Scanner(System.in);
      Random r = new Random();
      int[] lotto_com = new int[6];
      int[] lotto_user = new int[6];
      int count;
      int match_count = 0;
      int i, j;

      for(i = 0; i < 6; i++){
        count = i;
        lotto_com[i] = r.nextInt(45) + 1;
        for(j = 0; j < count; j++){
          if(lotto_com[i] == lotto_com[j])
            i--;
        }
      }

      for(i = 0; i < 6; i++){
        count = i;
        System.out.print("Enter your " + (i+1) + "th lotto number > ");
        lotto_user[i] = s.nextInt();
        if(lotto_user[i] > 45 || lotto_user[i] < 1){
          System.out.println("Invalid input!");
          i--;
          continue;
        }
        for(j = 0; j < count; j++){
          if(lotto_user[i] == lotto_user[j]){
            System.out.println("Invalid input!");
            i--;
            break;
          }
        }
      }

      System.out.print("Lotto numbers of this week are ");

      for(i = 0; i < 6; i++){
        if(i == 5)
          System.out.println(lotto_com[i]);
        else
          System.out.print(lotto_com[i] + " ");
      }

      for(i = 0; i < 6; i++){
        if(lotto_com[i] == lotto_user[i])
          match_count++;
      }

      System.out.println("There are " + match_count + " matching lotto numbers");

    }
}