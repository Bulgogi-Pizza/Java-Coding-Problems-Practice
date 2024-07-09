package modern.challenge;

import java.util.ArrayList;

// String이 주어짐, 각 문자의 개수 세기
public class Strings {
    static void answer(String str) {
        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Integer> indexList = new ArrayList<>();
        boolean include = false;
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < strList.size(); j++) {
                if (str[i].equals(strList[j])) {
                    include = true;
                    index = j;
                }
            }
            if (include) {
                indexList[index] += 1;
            } else {
                strList.add(strList[i]);
                indexList.add(0);
            }
        }

        for (int j = 0; j < strList.length; j++) {
            System.out.println(strList[i] + ": " + indexList[i]);
        }
    }
}
