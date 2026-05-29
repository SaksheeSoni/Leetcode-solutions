class Solution {
    public boolean isPalindrome(String s) {
        String cleanedS = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = cleanedS.length()-1;

        while(left < right){
            if(cleanedS.charAt(left) != cleanedS.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
