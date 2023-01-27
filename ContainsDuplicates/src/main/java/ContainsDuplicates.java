

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        for (var i = 0; i < nums.length; i++) 
        {
            for (var j = 0; j < nums.length; j++) 
            {
                if (i != j) 
                {
                    if (nums[i] == nums[j]) 
                    {
                        return true; 
                    }
                }
            }
        }
        return false;
    }
}
