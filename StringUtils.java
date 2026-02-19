import java.util.Arrays;
import java.util.Scanner;


public class StringUtils {

    public static String explode(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=s.length(); i++)
            sb.append(s.substring(0,i));

        return sb.toString();
    }

    public static String sort(String s)
    {
        char sc[] = s.toCharArray();
        Arrays.sort(sc);
        return new String(sc);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        
        System.out.println(explode(in));       
        System.out.println(sort(in)); 
    }
}