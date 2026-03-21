import java.util.*;

public class main {
    public static void main(String args[]) {

       // for (int i = 0; i <= 10; i++) {
         //   System.out.println("hello world");
       // }
       //for(int i=0;i<2;i++){
       // System.out.println(i);
       //}
       /*int i=0;
       while(i<100){
        System.out.println(i);
        i++;
       }*/
      /*int i=1;
      do{
        System.out.println(i);
        i++;
      }
      while(i<100);*/
      Scanner sc = new Scanner (System.in);
      int n= sc.nextInt();

      int mul=0;
      for( int i=1;i<=20;i++){
        System.out.println(i*n);
      }
      

    }
}