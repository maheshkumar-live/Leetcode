/* Question ---->
-----------------

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:
----------
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
----------
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
----------
Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:
------------
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
------------------------------
 */

import java.util.HashMap;

class Solution {
    public static int[] twoSum(int[] nums, int target) 
    {
        // Create a hash table to store the elements of the array.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        /* The HashMap class is used to implement a hash table. 
        The put() method adds a key-value pair to the hash table. 
        The key is the element of the array and the value is the index of the element in the array.
         */

        // Iterate over the array and find the two elements that add up to the target.
        for (int i = 0; i < nums.length; i++) 
        {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) 
            {
                return
 
            new
            
            int[] {i, map.get(diff)};
            }
        }
        /* The containsKey() method checks if the hash table contains a key-value pair with the specified key. 
        The get() method returns the value associated with the specified key, or null if the key is not in the hash table.
        For each element in the array, we calculate the difference between the target and the element. 
        If the difference is found in the hash table, then we have found the two elements that add up to the target. 
        We also need to check that the two elements are not the same element.
        */

        // If no two elements add up to the target, return null. If we found the two elements that add up to the target, we return their indices. Otherwise, we return null.

        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = twoSum(nums, target);
        if (indices != null) {
            System.out.println("The indices of the two numbers that add up to " + target + " are " + indices[0] + " and " + indices[1]);
        } else {
            System.out.println("No two numbers add up to " + target);
        }
    }
}

/* Approach:
------------
Step 1: Create a hash table to store the elements of the array.

        The hash table is used to store the elements of the array and their indices. This will allow us to quickly find the index of an element in the array, given its value.

Step 2: Iterate over the array and find the two elements that add up to the target.

        For each element in the array, we calculate the difference between the target and the element. If the difference is found in the hash table, then we have found the two elements that add up to the target.

Step 3: Return the indices of the two elements, or null if no two elements add up to the target.

        If we found the two elements that add up to the target, we return their indices. Otherwise, we return null
*/
