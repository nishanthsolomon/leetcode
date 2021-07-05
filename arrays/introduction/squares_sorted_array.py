class Solution:
    def sortedSquares(self, nums):
        new_list = []
        i = 0
        j = len(nums)-1
        while j >= i:
            if abs(nums[i]) > abs(nums[j]):
                new_list.append(nums[i]**2)
                i += 1
            else:
                new_list.append(nums[j]**2)
                j -= 1

        return new_list[::-1]


if __name__ == "__main__":
    solution = Solution()
    nums = [-4, -1, 0, 3, 10]

    print(solution.sortedSquares(nums))
