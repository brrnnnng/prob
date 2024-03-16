package lesson14;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();

        nums.add(2);
        nums.add(6);
        nums.add(4);
        nums.add(3);

        nums.set(0,222);



        System.out.println(nums);
    }
}
