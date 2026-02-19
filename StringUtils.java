import java.util.Arrays;
import java.util.Scanner;


public class StringUtils {

    public static String reverse(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--)  sb.append(s.charAt(i));
           
        return sb.toString();
    }

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

    public static boolean isAnagram(String s1, String s2)
    {
        char sc1[] = s1.toCharArray();
        char sc2[] = s2.toCharArray();
        Arrays.sort(sc1);
        Arrays.sort(sc2);

        return Arrays.equals(sc1, sc2);
    }

    public static String mixedString(String s)
    {
        StringBuilder sb = new StringBuilder();
        String ws[] = s.split(" ");
        for(String w : ws)
        {
            sb.append(w.charAt(w.length()-1));
            if(w.length()>1)
            {
            sb.append(w.substring(1,w.length()-1));
            sb.append(w.charAt(0));
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String in1 = sc.nextLine();
        String in2 = sc.nextLine();
        String in3 = sc.nextLine();


        System.out.println(reverse(in1));
        System.out.println(explode(in1));       
        System.out.println(sort(in1)); 
        System.out.println(isAnagram(in1, in2));
        System.out.println(mixedString(in3));



    }
}