class Solution:
    def moveZeroes(self, nums):
        j = 0  # Position to place the next non-zero element

        # Move all non-zero elements to the front
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[j] = nums[i]
                j += 1

        # Fill the remaining positions with 0
        while j < len(nums):
            nums[j] = 0
            j += 1