class Solution {
    public boolean isPalindrome(int x) {
        int reverseNumber = 0;
        int original = x;

        if(x < 0) {
            return false;
        }

        while(x > 0) {
            reverseNumber = reverseNumber * 10 + x % 10;
            x = x / 10;
        }

        return reverseNumber == original;
    }
}
