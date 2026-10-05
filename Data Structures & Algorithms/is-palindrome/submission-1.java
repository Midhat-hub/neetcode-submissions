class Solution {
    public boolean isPalindrome(String s) {

        Deque<Character> stack = new ArrayDeque<>();
        String filtered = "";

        for(int i= 0; i<s.length();i++){
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                c = Character.toLowerCase(c);
                filtered = filtered + c;
                stack.push(c);
            }
        }
        String ns= "";
        
        while(!stack.isEmpty()){
            ns=ns+stack.pop();
        }

        if(filtered.equals(ns)){return true;}
        else{return false;} 

    }
}