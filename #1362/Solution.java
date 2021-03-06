class Solution {
    public int[] closestDivisors(int num) {
        int start = (int) Math.sqrt(num + 2);

        for (int i = start; i > 0; i--) {
            if ((num + 1) % i == 0) {
                return new int[] {i, (num + 1) / i};
            }
            if ((num + 2) % i == 0) {
                return new int[] {i, (num + 2) / i};
            }
        }

        return new int[] {1, num + 1};
    }
}