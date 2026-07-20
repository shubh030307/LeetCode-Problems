class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> op= new Stack<>();

        for(int i = 0 ; i<s.length();i++){
            if(op.empty()){
                op.push(s.charAt(i));
            }
            else if(s.charAt(i)=='(' ||s.charAt(i)=='[' ||s.charAt(i)=='{'|| s.charAt(i)=='}' ||s.charAt(i)==']' ||s.charAt(i)==')'){
                if(op.peek()=='{' && s.charAt(i)=='}'|| op.peek()=='(' && s.charAt(i)==')' || op.peek()=='[' && s.charAt(i)==']'){
                    op.pop();
                }else{
                    op.push(s.charAt(i));
                }
            }
        }
            if(op.empty()){
                return true;
            }
        return false;
    }
}