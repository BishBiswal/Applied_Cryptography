//Failing
class Solution {
    public boolean isSolvable(String[] words, String result) {
        
        Map<Character, Integer> hm1=new HashMap<>();
        Map<Integer, Character> hm2=new HashMap<>();
        Set<Character> set=new HashSet<>();
        for(String word:words){
            for(int i=0;i<word.length();i++){
                set.add(word.charAt(i));
            }
        }
        
        for(int i=0;i<result.length();i++){
                set.add(result.charAt(i));
            }
        
        if(set.size()>10) return false;
        
        List<Character> list = new ArrayList<>(set);
        return helper(hm1,hm2, list,words, result, 0);
        
        
    }
    
    
    public boolean helper(Map<Character, Integer> hm1, Map<Integer, Character> hm2, List<Character> set, String[] words, String result, int k){
        if(hm1.size()==set.size()){
            int lhs=0;
            
            for(String word:words){
                StringBuffer left=new StringBuffer();
                for(int i=0;i<word.length();i++){
                    left.append(String.valueOf(hm1.get(word.charAt(i))));
                }
                lhs+=Integer.parseInt(left.toString());
            }
            int rhs=0;
            StringBuffer right=new StringBuffer();
            for(int i=0;i<result.length();i++){
                right.append(String.valueOf(hm1.get(result.charAt(i))));
                
            }
            rhs=Integer.parseInt(right.toString());
            
            if(right.charAt(0)!='0'&& lhs==rhs){
               return true;
            } 
        }else{
                for(int i=0;i<=9;i++){
                    char ch=set.get(k);
                    if(!hm2.containsKey(i) && !hm1.containsKey(ch)){
                        hm2.put(i, ch);
                        hm1.put(ch, i);
                        boolean res=helper(hm1, hm2, set,words,result, k+1);
                        if(res){
                           return true; 
                        } 
                        hm1.remove(ch,i);
                        hm2.remove(i,ch);
                    }
                }
        }
        
        return false;
        
    }
}
