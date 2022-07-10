import java.util.HashMap;

public class Result {
    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        char[] string1 = s1.toCharArray(), string2 = s2.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char i: string1){
            if(!map.containsKey(i)){
                map.put(i,0);
            }
            else{
                map.put(i, map.get(i)+1);
            }
        }
        for(char j: string2){
            if(map.containsKey(j)){
                return "Yes";
            }
        }
        return "No";

    }
    public static void main(String[] args) {
        String s1 = "hello", s2 = "world";
        System.out.println(twoStrings(s1,s2));

    }
}
