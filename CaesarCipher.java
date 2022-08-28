//https://www.hackerrank.com/challenges/caesar-cipher-1/problem
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class CaesarCipher {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
    k=k%26;
    StringBuilder res=new StringBuilder();
    var len =s.length();
    for(int i=0;i<len;i++){
        char ch=s.charAt(i);
        if(!Character.isLetter(ch)){
            res.append(Character.toString(ch));
            continue;
        }
        
        int resVal=(int) ch+k;
        if(Character.isUpperCase(ch) && resVal>90){
            resVal=(resVal%90)+64;
        }
        
        if(Character.isLowerCase(ch) && resVal>122){
            resVal=(resVal%122)+96;
        }
        
        String out=Character.toString((char)resVal);
        res.append(out);
        
    }
    return res.toString();

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
