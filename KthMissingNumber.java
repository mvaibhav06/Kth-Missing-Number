import java.util.ArrayList;
import java.util.List;

public class KthMissingNumber
{
    public static int findMissingNumber(int[] nums, int k){
        int i = 0;
        List<Integer> missing = new ArrayList<>();
        for (int j=1; j<nums[nums.length-1]; j++){
            if (nums[i] == j){
                i++;
            }else {
                missing.add(j);
            }
        }
        if (missing.size() < k){
            int size = missing.size();
            for (int p=0; p<(k-size); p++){
                if (p == 0){
                    missing.add(nums[nums.length-1]+1);
                }else {
                    missing.add(missing.get(missing.size()-1)+1);
                }
            }
        }

        return missing.get(k-1);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(findMissingNumber(nums,2));
    }
}
