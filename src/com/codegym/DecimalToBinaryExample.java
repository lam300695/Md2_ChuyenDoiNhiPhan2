package com.codegym;

import java.util.Stack;

public class DecimalToBinaryExample {
    public void convert(int num) {
        Stack<Integer> stack = new Stack<>();
        while (num != 0) {
            int soDu = num % 2;
            stack.push(soDu);
            num /= 2;
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
