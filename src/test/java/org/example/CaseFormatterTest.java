package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class CaseFormatterTest {
    @Test
    void isSwitchingCase(){
        String str = CaseFormatter.formatSwitchingCase("caseFormatter");

        char [] charArray = str.toCharArray();

        for(int i=0; i<str.length();i++){
            if(i%2 != 0) {
                Assertions.assertTrue(Character.isUpperCase(charArray[i]));
            }
            else Assertions.assertTrue(Character.isLowerCase(charArray[i]));
        }
    }

    @Test
    void NullInputCheck() {
        Assertions.assertNull(CaseFormatter.formatSwitchingCase(null));
    }
}