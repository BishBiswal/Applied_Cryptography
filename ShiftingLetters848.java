//Fails for few test cases
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        
        int[] res=new int[shifts.length];
        
        int i=shifts.length-2;
        res[i+1]=shifts[i+1];
        
        while(i>=0){
            res[i]=res[i+1]+shifts[i];
            i--;
        }
        StringBuilder sb=new StringBuilder();
        
        for(int j=0;j<shifts.length;j++){
            res[j]=res[j]%26;
            int out=((int)s.charAt(j)+res[j]);
            if(out>122){
                out=(out%122)+96;
            }
            String newStr=Character.toString((char)out);
            sb.append(newStr);
        }
        
        return sb.toString();
        
        
    }
}

//Works fine

class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        
        int[] res=new int[shifts.length];
        
        int i=shifts.length-2;
        res[i+1]=shifts[i+1];
        
        while(i>=0){
            res[i]=(res[i+1]+shifts[i])%26;
            i--;
        }
        StringBuilder sb=new StringBuilder();
        
        for(int j=0;j<shifts.length;j++){
            int k=res[j];
            int out=(((int)(s.charAt(j)-'a')+k) %26)+97;
            String newStr=Character.toString((char)out);
            sb.append(newStr);
        }
        
        return sb.toString();
        
        
    }
}

