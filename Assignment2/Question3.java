import java.util.*;

public class Question3 {
    static void listTrim(List<String> strings) {
        for (ListIterator<String> lit = strings.listIterator(); lit.hasNext(); ) {
            lit.set(lit.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> L = Arrays.asList(" DHONI ", " ROHITH ", " KOHLI ");
        listTrim(L);
        for (String s : L) {
            System.out.format("\"%s\"%n", s);
        }
    }
}