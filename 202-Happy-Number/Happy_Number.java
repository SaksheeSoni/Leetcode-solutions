class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> r = new HashSet<>();

        while(n != 1 && !r.contains(n)){
            r.add(n);
            int sum = 0;
            while(n > 0){
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            n = sum;
        }

        return n == 1;
    }
}
