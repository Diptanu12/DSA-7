import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
     //   permuX("abc" , "");
        System.out.println(permuCount("abcd" , ""));
//        ArrayList<String> ans=permuX1("abc", "");
//        System.out.print(ans);
    }
    public static void permuX(String str, String permu){
        if(str.isEmpty()){
            System.out.println(permu);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            permuX(newStr, permu+ch);
        }
    }

    public static ArrayList<String> permuX1(String str, String permu){
        if(str.isEmpty()){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(permu);
            return  ans;
        }
        ArrayList<String> list=new ArrayList<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            list.addAll(permuX1(newStr, permu+ch));
        }
        return list;
    }

    public static int permuCount(String str, String permu){
        if(str.isEmpty()){

            return 1;
        }
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
           count = count + permuCount(newStr, permu+ch);
        }
        return count;
    }

}
