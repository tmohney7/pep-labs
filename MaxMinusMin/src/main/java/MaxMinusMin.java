
import java.util.List;
import java.lang.Math;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
//        for (i = 0; i < nums.length; i++){
//        int result = (Math.max(nums) - Math.min(nums));
//            return result;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int elem : nums) {
            if (elem < min) min = elem;
            if (elem > max) max = elem;
        }
        return (max - min);
}
}
