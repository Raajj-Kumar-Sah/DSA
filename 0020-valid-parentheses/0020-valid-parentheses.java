class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push the expected closing bracket for every opening one
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else {
                // If a closing bracket appears but stack is empty or doesn't match
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;

                }}

        
    }
    
        // If stack is empty → all brackets matched
        return stack.isEmpty();
}}


// while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
        //     s = s.replace("()", "")
        //          .replace("{}", "")
        //          .replace("[]", "");
        // }

        
        // return s.isEmpty();
