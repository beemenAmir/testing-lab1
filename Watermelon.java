
import java.util.Scanner;


public class Watermelon {

    private int weight;

    public Watermelon(int weight) {
        this.weight = weight;
    }
    public String isDivisible(){
       if(weight>0 && weight <= 100){
          float temp = weight/2;
          if(weight%2 == 0 && temp!= 1){
              return "YES";
          }
          else{
       return"NO";
          }
          
          
        }
        return null;
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Watermelon watermelon = new Watermelon(a);
        String s = watermelon.isDivisible();
        System.out.println(s);
    }
    
}
