class Solution {
    public int romanToInt(String s) {
        int number = 0;

        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X',10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i < s.length() - 1 && m.containsKey(c) && m.get(c) < m.get(s.charAt(i + 1))) {
                number -= m.get(c);

            } else {
                number += m.get(c);

            }
        }
        
        return number;
        
    }
}