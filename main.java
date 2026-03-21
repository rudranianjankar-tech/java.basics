import java.util.*;
public class main {
    public static void main(String args[]){
       /*  Scanner sc= new Scanner (System.in);
        int age= sc.nextInt();

        if(age>18){
            System.out.println("adult");
        }else{
            System.out.println("kid");
        }*/

            Scanner sc= new Scanner (System.in);
            int button=sc.nextInt();

            /*if(button==1){
                System.out.println("hello girl");}
            else if (button==2){
                System.out.println("namaste");}
            else if (button==3){
                System.out.println("hmm no hi");}
            else{
                System.out.println("goodbye");}*/

                switch(button){
                    case 1:
                        System.out.println("helo");
                        break;
                    case 2:
                        System.out.println("hmm hi");
                        break;
                    case 3: 
                    System.out.println("bye bye");
                    break;

                    default:
                        System.out.println("go to hell");
                }



    }
    
}
