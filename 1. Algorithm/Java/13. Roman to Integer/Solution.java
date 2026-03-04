class Solution {
    public int romanToInt(String s) {
        int arr[] = {1,5,10,50,100,500,1000};
        String str = "IVXLCDM";
        int res = 0;
        char c;
        int front;
        int curr;
        for(int i = s.length()-1; i >= 0; i--)
        {
            curr = str.indexOf(s.charAt(i));
            if(i == 0)
            {
                res = res + arr[curr];
                return res;
            }
            front = str.indexOf(s.charAt(i-1));
            if(front < curr)
            {
                res = res - arr[front] + arr[curr];
                i--;
            }
            else
            {
                res = res + arr[curr];
            }
        }
        return res;
    }
}
