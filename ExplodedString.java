import java.util.Scanner;


public class ExplodedString {

    public static String explode(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=s.length(); i++)
            sb.append(s.substring(0,i));

        return sb.toString();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(explode(sc.nextLine()).toCharArray());       
    }
}