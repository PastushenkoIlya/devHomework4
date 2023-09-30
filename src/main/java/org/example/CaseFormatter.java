package org.example;


public class CaseFormatter {
    //private constructor, because it's a utility class
    private CaseFormatter(){

    }
    public static String formatSwitchingCase(String str) {
        if(str == null) return null;

        char[] charArray = str.toCharArray();
        for(int i=0; i < str.length(); i++){
            if(i%2 == 0) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
            else{
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        return String.valueOf(charArray);

    }
}
