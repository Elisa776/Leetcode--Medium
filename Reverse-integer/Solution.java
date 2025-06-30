class Solution {
    public int reverse(int x) {

        int s = 0;
        int r= 0;
        

        while(x!=0){

            r = x%10;

            if (s > Integer.MAX_VALUE / 10 || (s == Integer.MAX_VALUE / 10 && r > 7)) 
                return 0;
            if (s < Integer.MIN_VALUE / 10 || (s == Integer.MIN_VALUE / 10 && r < -8))
                return 0;

            s = s*10+r;
            x = x/10;
        }
    return s;
        
    }
}
