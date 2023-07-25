import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//String test = "10";
//test = test.substring(1,2);
//int answer = Integer.parseInt(test);
    }
}


class Solution {
    public int singleNumber(int[] nums) {
        int ans=0; //since XOR with 0 returns same number
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  // ans = (ans) XOR (array element at i)
        }
        return ans;
    }
}
// 100 ^ 001 = 101 : 4 ^ 1
// 101 ^ 010 = 111 : 5 ^ 2
// 111 ^ 001 = 110: 7 ^ 1
// 110 ^ 010 = 100: 6 ^ 2 = 4
// the binary place is flipped on and off





//class Solution {
//    public int singleNumber(int[] nums) {
//        Map<Integer, Integer> m = new HashMap<>();
//        for (int n : nums) {
//            if (!m.containsKey(n)) {
//                m.put(n, 1);
//            } else {
//                m.remove(n);
//            }
//        }
//        String temp = m.keySet() + "keyset";
//        return Integer.parseInt(temp.substring(1,2)); // fails but not sure why...
//    }
//}


// here is my best go: create map, put key with value 1. if value alreready exists, deleete the key. Return keyset as
// string and retrieve index 1 for only remaining key. convert char to int

// seceond array where we add a number then delete it if alreeady found and rreeturn a single item array.
// downside is that each item will have to usee delete function on second aray which is iterative approach
// so whilee my codee will only show one for loop, it will not be linear

// map where put value if non existant and reduce valuee to 0 or even better delete the key if does exist.
// problem is im not sure if i can return a single value from thee map unless i know thhe number i'm looking for.
// converting map contents to string then getting index of strinrg and rrreturning conveerteed char to int seems dumb
