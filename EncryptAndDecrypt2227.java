class Encrypter {
    Map<String, Integer> freq;
    Map<Character, String> map;

    public Encrypter(char[] keys, String[] values, String[] dictionary) {
        encrypt=new HashMap<>();
        freq=new HashMap<>();
        map=new HashMap<>();
        for(int i=0;i<keys.length;i++){
            map.put(keys[i], values[i]);
        }
        
        for(String word :dictionary){
            String enc=encrypt(word);
            if(enc!=null)
            freq.put(enc,freq.getOrDefault(enc,0)+1);
            
        }
        
    }
    
    public String encrypt(String word1) {
            StringBuffer sb=new StringBuffer();
            boolean flag=true;
            for(int i=0;i<word1.length();i++){
                char ch=word1.charAt(i);
                if(!map.containsKey(ch)){
                    flag=false;
                }
                sb.append(map.get(ch));
            }
        if(flag==false) return null;
        return sb.toString();
        
    }
    
    public int decrypt(String word2) {
        if(!freq.containsKey(word2)){
            return 0;
        }
        return freq.get(word2);
        
    }
}

/**
 * Your Encrypter object will be instantiated and called as such:
 * Encrypter obj = new Encrypter(keys, values, dictionary);
 * String param_1 = obj.encrypt(word1);
 * int param_2 = obj.decrypt(word2);
 */
