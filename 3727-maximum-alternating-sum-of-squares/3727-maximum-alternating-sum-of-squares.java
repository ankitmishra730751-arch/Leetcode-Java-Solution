import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        long[] squares = new long[n];

        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }

        Arrays.sort(squares);

        long sum = 0;
        int positiveCount = (n + 1) / 2;

        for (int i = 0; i < n; i++) {
            if (i < positiveCount) {
                sum += squares[n - 1 - i];
            } else {
                sum -= squares[n - 1 - i];
            }
        }

        return sum;
    }
}

