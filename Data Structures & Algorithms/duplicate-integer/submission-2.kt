class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seen = mutableSetOf<Int>()

        nums.forEach {i ->

        if(seen.contains(i)) return true
        seen.add(i)

        }
        return false
    }
}
