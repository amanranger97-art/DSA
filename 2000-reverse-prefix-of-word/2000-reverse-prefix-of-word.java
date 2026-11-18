class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i<word.length()){
        char c= word.charAt(i);
        st.push(c);
        if(c==ch){
            break;
        }
        i++;
        }
        if(i==word.length()){
            return word;
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.append(word.substring(i+1));
        return ans.toString();
    }
}