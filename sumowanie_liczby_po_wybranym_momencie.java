
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int suma = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {

            String s = reader.readLine();
            if (s.equals("sumuj")) {
                System.out.println(suma);
                break;
            }
            int a = Integer.parseInt(s);
            suma += a;

        }
    }
}

