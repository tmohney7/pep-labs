public class Search2dArray {
    /**
     * Receive a 2d array of ints. (That's an array of arrays!)
     * Your task is to search the array for a matching value, return true if found false otherwise.
     * You'll need to use a for loop within a for loop - each for loop handles searching in a particular dimension.
     * I recommend reasoning through this problem on pencil and paper.
     *
     * @param nums a two dimensional array - meaning, an array of arrays.
     * @param target a value that may be contained within nums.
     * @return true if nums contains target, and false otherwise.
     */
    public boolean search(int[][] nums, int target){
        for (int row = 0; row < nums.length; row++)
    {
        for (int col = 0; col < nums[row].length; col++)
        {
            int num = nums[row][col];
            for (int otherCol = col + 1; otherCol < nums.length; otherCol++)
            {
                if (num == nums[row][otherCol])
                {
                    return true;
                }
            }
        }
    }

    return false;
}
}

