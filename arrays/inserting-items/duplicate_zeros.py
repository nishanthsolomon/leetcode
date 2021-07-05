class Solution:
    def duplicateZeros(self, arr) -> None:
        """
        Do not return anything, modify arr in-place instead.
        """
        new_arr = []
        for n in arr:
            new_arr.append(n)
            if n == 0:
                new_arr.append(0)

        for i in range(len(arr)):
            arr[i] = new_arr[i]


if __name__ == "__main__":
    solution = Solution()
    arr = [1, 0, 2, 3, 0, 4, 5, 0]

    solution.duplicateZeros(arr)

    print(arr)
