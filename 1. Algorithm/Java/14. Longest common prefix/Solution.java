class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int pos = strs[0].length();
        for(String s : strs)
        {
            if(s.length() < pos)
            {
                pos = s.length();
            }
        }
        for(int i = 0; i < pos; i++)
        {
            for(int j = 0; j < strs.length; j++)
            {
                if(strs[0].charAt(i) != strs[j].charAt(i))
                {
                    return sb.toString();
                }
                else
                {
                    if(j == strs.length-1)
                    {
                        sb.append(strs[0].charAt(i));
                    }
                }
            }
        }
        return sb.toString();
    }
}
