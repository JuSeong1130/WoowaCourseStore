package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = new ArrayList<>();
        Map<String,List<String>> friendsMap =  getFriendsMap(friends);

        return answer;
    }
    public static Map<String,List<String>> getFriendsMap(List<List<String>> friends){
        Map<String,List<String>> map = new HashMap<>();

        for(int i=0; i<friends.size();i++){
            String leftName = friends.get(i).get(0);
            String rightName = friends.get(i).get(1);
            List<String> leftList= map.getOrDefault(leftName, new ArrayList<>());
            leftList.add(rightName);
            List<String> rightList = map.getOrDefault(rightName, new ArrayList<>());
            rightList.add(leftName);
            map.put(leftName,leftList);
            map.put(rightName,rightList);
        }
        return map;
    }
}
