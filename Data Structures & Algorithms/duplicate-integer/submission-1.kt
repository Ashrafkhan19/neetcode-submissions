class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = mutableMapOf<Int,Int>()

        nums.forEach {i ->

        if(seen.contains(i)) return true
        seen[i] = i

        }
        return false
    }
}
