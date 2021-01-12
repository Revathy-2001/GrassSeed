import java.util.*;
class Grassseed{
    public static void main(String[] args){
       Scanner kbd = new Scanner(System.in);
       double c = kbd.nextDouble();
       if(c > 0 && c <= 100){
         int n = kbd.nextInt();
         if(n > 0 && n <= 100){
             double ans = 0;
             for(int i = 0;i < n;i++){
                 double l = kbd.nextDouble();
                 double w = kbd.nextDouble();
                 ans = ans + (l*w);
             }
             System.out.format("%.7f%n",ans*c);
         }
       }
    }
}