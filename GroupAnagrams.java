// Time Complexity: O(NKlogK) where N is length of strs
// K is max length of string in strs, outloop is N
// Space Complexity: O(NK), total contect in result

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        for(String s : strs) { // nklog k
            double primeProduct = primeProduct(s);
            if(!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s);
        }
        return new ArrayList<>(map.values()); // O(n)
    }

    private double primeProduct(String s) {
        int[] primes = {23,3,2,65,65,61,195,1,56,65,897,8,1,72};
        double result = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); //b  //98-97 = 1
            int prime = primes[c - 'a'];
            result *= prime;

        }
        return result;
    }
}
