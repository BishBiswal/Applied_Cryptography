class Solution {
    public String freqAlphabets(String s) {
        StringBuffer sb=new StringBuffer();
        int i=s.length()-1;
        while(i>=0){
            char ch=s.charAt(i);
            
            if(ch=='#'){
                int digit=Character.getNumericValue(s.charAt(i-1));
                int prevdigit=Character.getNumericValue(s.charAt(i-2));
                int val=prevdigit*10+digit;
                String s1=String.valueOf((char)(val+96));
                sb.append(s1);
                i-=3;
            }else{
                int val1=Character.getNumericValue(s.charAt(i));
                String s2=String.valueOf((char)(val1+96));
                sb.append(s2);
                i-=1;
            }
        }
    
        return sb.reverse().toString();
    }
}
