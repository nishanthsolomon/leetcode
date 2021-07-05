class Solution:
    def findNumbers(self, nums) -> int:
        count = 0
        for num in nums:
            if len(str(num)) % 2 == 0:
                count += 1

        return count


if __name__ == "__main__":
    solution = Solution()
    nums = [12, 345, 2, 6, 7896]

    print(solution.findNumbers(nums))
