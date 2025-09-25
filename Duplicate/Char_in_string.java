package Duplicate;

import java.util.Scanner;
import java.util.Stack;

class Char_in_string {
    
    

    public static void main(String[] args) {
        System.err.println("Remove the adjacent duplicate character in the String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        String result = removeduplicate(str);
        System.out.println(result);
        sc.close();
    }

    public static String removeduplicate(String str){
        Stack<Character> stack = new Stack<>();
        for( char ch : str.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==ch){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder stb = new StringBuilder();
        for(char ch : stack){
            stb.append(ch);
        }
        return stb.toString();
    }

}