class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        //get shortest word

        int min=strs[0].length();

        for (String w: strs){
            int x= w.length();
            if (x<min) min=x;
        }
        String str= "";
        int len=strs.length;
        String f = strs[0];

        for (int i = 0; i<min;++i){
            char first = f.charAt(i);
            boolean hasFirst = true;

            for (int j=1; j<len; ++j){
                if (strs[j].charAt(i)!=first) hasFirst=false;
            }
            if (hasFirst) str+=first;
            else return str;
        }
        return str;
    }
}