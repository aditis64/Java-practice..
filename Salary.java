import java.util.*;
public class Main {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        float b=sc.nextInt();
        char g=sc.next().charAt(0);
        float hra=b*0.2f;
        float da=b*0.5f;
        int allow=0;
        if(g=='A')
            allow=1700;
        else if(g=='B')
            allow=1500;
        else 
            allow=1300;
        float pf=b*0.11f;
        float total=b+hra+da+allow-pf;
        total=total+0.5f;
        System.out.println((int)total);
	}
}