import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


    }
}

class Solution {
    public int singleNumber(int[] nums) {

    }
}

// seceond array where we add a number then delete it if alreeady found and rreeturn a single item array.
// downside is that each item will have to usee delete function on second aray which is iterative approach
// so whilee my codee will only show one for loop, it will not be linear

// map where put value if non existant and reduce valuee to 0 or even better delete the key if does exist.
// problem is im not sure if i can return a single value from thee map unless i know thhe number i'm looking for.
// converting map contents to string then getting index of strinrg and rrreturning conveerteed char to int seems dumb
