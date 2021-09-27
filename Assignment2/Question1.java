import java.util.*;

public class Question1 {

    public static void main(String[] args) {
        
        
        List<String> tempList = Arrays.asList(args);
        Collections.shuffle(tempList);
        tempList.stream()
        .forEach(e->System.out.format("%s ",e));
        for (String arg: tempList) {
            System.out.format("%s ", arg);
        }

        System.out.println();
    }
}