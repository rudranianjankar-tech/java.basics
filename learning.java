import java.util.*;


class Keyboard {
    int keys ;
    String color;
    static String brand= "hmm";

 public Keyboard()
    {
        keys=100;
        color="black";
    }
    public int getKeys() {
        return keys;
    }
 public void setKeys(int keys) {
        this.keys = keys;
    }
public String getColor() {
        return color;
    }
 public void setColor(String color) {
        this.color = color;
    }



    public void pressed() {
        System.out.println("signal sent " + color);
    }

    public void throwIt() {
        System.out.println("got hit");
    }
}

class advKeyboard extends Keyboard {
    public void gethit()
    {
       System.out.println("dumb got hit");
    }
}



public class learning {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);

       // String name = sc.nextLine();
        //int age = 19;
        //boolean result = (age != 0);

        //System.out.println(name + " age is " + age + " " + result);

        

        Keyboard obj1 = new Keyboard();
        obj1.pressed();
        obj1.throwIt();
        //System.out.println(obj1.keys);

       // obj1.setColor("green");
       // System.out.println(obj1.getKeys());

        advKeyboard obj2 = new advKeyboard();
        obj2.gethit();
        obj2.pressed();
        System.out.println(Keyboard.brand);
    }
}