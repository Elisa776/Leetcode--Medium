### Smallest Subarrays With Maximum Bitwise OR

####  Problem Description:

Given a 0-indexed integer array `nums`, for every index `i`, determine the length of the **smallest subarray starting from `i`** (inclusive) such that the bitwise OR of that subarray is **equal to the maximum bitwise OR possible** starting from `i`.

#### Input Format:

* An integer array `nums` of length `n` where `0 <= nums[i] <= 10⁹`

#### Output Format:

* An integer array `answer` of size `n`
* Each `answer[i]` represents the **minimum length** of a subarray starting at `i` such that its OR is **maximum** from that index.


####  Example:

**Input:**
`nums = [1, 0, 2, 1, 3]`

**Output:**
`[3, 3, 2, 2, 1]`


####  Approach Summary:

* Traverse the array from right to left to precompute the **maximum OR** values at each index and store in a new array.
* Then, for each index `i`, check how many elements are required to reach that maximum OR.
* The second loop breaks once the OR becomes equal to the precomputed maximum at that index.

#### Time Complexity:

* Worst case: **O(n²)**
* But efficient enough for moderate constraints.
  
**Author**

Elisha
