public class PickFromBothSide {
    public int pickFromBothSide(int[] nums, int B) {
        int sum = 0;
        for (int i = 0; i <B; i++) {
            sum += nums[i];
        }
        int left = B-1;
        int right = nums.length-1;
        int max_sum =sum;
        while (left >= 0 && right >=0) {
            sum = sum - nums[left--] + nums[right--];
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum;

    }
    public static void main(String[] args) {
        int[] nums = {5, -2, 3 , 1, 2};
        PickFromBothSide pickFromBothSide = new PickFromBothSide();
        System.out.println(pickFromBothSide.pickFromBothSide(nums,3));
    }
}
