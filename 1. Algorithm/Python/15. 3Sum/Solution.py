class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        newArr = sorted(nums)
        resArr = list(list())
        sum = 0
        for i in range(len(newArr)):
            if(i == (len(newArr)-2)):
                break
            j = i + 1
            lastNum = len(newArr) - 1
            while j < lastNum:
                sum = newArr[j] + newArr[lastNum]
                if sum < (newArr[i]*(-1)):
                    j += 1
                    continue
                elif sum > (newArr[i]*(-1)):
                    lastNum -= 1
                    continue
                else:
                    if [newArr[i],newArr[j],newArr[lastNum]] not in resArr:
                        resArr.append([newArr[i],newArr[j],newArr[lastNum]])
                    j += 1
                    lastNum -= 1
        return resArr                
        
