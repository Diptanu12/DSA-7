import java.lang.reflect.Array;
import java.util.ArrayList;

public class printSubseq {
    public static void main(String[] args) {
        //subSeq("", "cde");

        ArrayList<String> subsequences = subSeq1("", "abc");
        System.out.println(subsequences);
    }

    public static void subSeq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSeq(p, up.substring(1));
        subSeq(p + ch, up.substring(1));
    }

    public static ArrayList<String> subSeq1(String p,
                                            String up) {


        if (up.isEmpty()) {
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
           return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> right = subSeq1(p + ch, up.substring(1));
        ArrayList<String> left = subSeq1(p, up.substring(1));

        right.addAll(left);
        return right;
    }
}
