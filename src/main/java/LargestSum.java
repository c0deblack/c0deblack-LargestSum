
import java.util.List;

public class LargestSum {
    public int getLargest(List<Integer> l, Integer largest)
    {
        Integer lhs = l.remove(0);

        if(l.size() == 0) return largest;

        if(largest == null)
        {
            largest = lhs + l.get(0);
        }

        for(Integer i : l)
        {
            Integer sum = lhs + i;
            if(sum > largest) largest = sum;
        }

        return getLargest(l, largest);
    }
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        return getLargest(nums, null);
    }
}