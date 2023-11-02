package org.courses.ex3_4;

public class MyString {
    public static void main(String[] args) {

        String sentence = new String();
        sentence = "Java has remained popular due to its versatility and robustness.";
        String substring1 = sentence.substring(0, sentence.length()/2);
        String substring2 = sentence.substring(sentence.length()/2);

        System.out.println(substring1);
        System.out.println(substring2);

    }
}
