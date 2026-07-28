class Solution {
    public boolean isPalindrome(String s) {
        String check=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String rev= new StringBuilder(check).reverse().toString();
        if(check.equals(rev)){
            return true;
        }
        return false;
    }
    
}