class Solution {
    public boolean uniformArray(int[] nums1) {

        int minOdd = Integer.MAX_VALUE;
        for (int x : nums1) {
            if (x % 2 != 0) {
                minOdd = Math.min(minOdd, x);
            }
        }
        boolean allEven = true;

        for (int x : nums1) {
            if (x % 2 != 0) {
                if (minOdd == Integer.MAX_VALUE || x - minOdd < 1) {
                    allEven = false;
                    break;
                }
            }
        }

        if (allEven) {
            return true;
        }
        boolean allOdd = true;

        for (int x : nums1) {
            if (x % 2 == 0) {
                if (minOdd == Integer.MAX_VALUE || x - minOdd < 1) {
                    allOdd = false;
                    break;
                }
            }
        }

        return allOdd;
    }
}