class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int digitSum = 0;
            int n = nums[i];

            while (n > 0) {
                digitSum += n % 10;
                n /= 10;
            }

            if (digitSum < min) {
                min = digitSum;
            }
        }

        return min;
    }
}
