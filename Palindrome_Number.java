public class Palindrome_Number {

    // O(n)
    public boolean isPalindrome(int x) {
        String x1 = Integer.toString(x);
        int n = x1.length();
        for (int i = 0; i < n / 2; i++) {
            if (x1.charAt(i) != x1.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
    //Different approach
    // O(log(n))
    public boolean isPalindrome3(int x) {
        int xO = x, xN = 0;
        
            while(x>0){
                int R = x%10;
                xN = xN*10 + R;
                x = x/10;
            }
        
            if (xO == xN) return true;
            return false; 
        
            
        }

    public static void main(String[] args) {
        Palindrome_Number pn = new Palindrome_Number();
        int x = 121;
        System.out.println(pn.isPalindrome(x));
        System.out.println(pn.isPalindrome3(x));
    }
}
