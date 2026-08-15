import java.util.*;
class Solution {
    public boolean check(int[] nums) {
        int[] a = new int[nums.length];
        int i = 0;
        for (int x : nums) {
            a[i++] = x;
        }
        Arrays.sort(a);
        int k = 0;
        while (k < nums.length) {
            int temp = a[0];
            int j = 0;
            while (j + 1 < nums.length) {
                a[j] = a[j + 1];
                j++;
            }
            a[j] = temp;
            if (Arrays.equals(a, nums)) {
                return true;
            }
            k++;
        }
        return false;
    }
}