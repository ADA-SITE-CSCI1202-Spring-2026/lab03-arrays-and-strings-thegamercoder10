import java.util.Scanner;


public class ExplodedString {

    public static String explode(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++)
            for(int j = 0; j<=i; j++) sb.append(s.charAt(j));

        return sb.toString();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(explode(sc.nextLine()).toCharArray());       
    }
}