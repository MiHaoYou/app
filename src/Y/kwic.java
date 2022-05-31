package Y;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
public class kwic {
    String str = "you are a child";
    String[] str1,str2;
    //Array.List() List = new
    public static void main(String[] args) throws Exception{
    kwic y = new kwic();
    y.Input();
    y.Cycle_shift();
    y.Sore();
    }

    public void Input() throws Exception {
        /*Scanner str1 =new Scanner(System.in);
        str =str1.next();*/
        System.out.println(str);
    }
    public void Cycle_shift() throws Exception {
        int i,j;
        String[] str2 = new String[str1.length];
        str1 = str.split(" ");
        //System.out.println(Arrays.toString(str1));
        String list = null;
        for(i = 0;i<str1.length;i++){
            list = str1[0];
        for (j = 0; j < str1.length-1; j++){
            str1[j] = str1[j + 1];
        }
            str1[str1.length-1] = list;
            StringBuffer sb = new StringBuffer();
            for (int k = 0; k < str1.length; k++){
                sb.append(str1[k]);
                sb.append(" ");
            }
            String s = sb.toString();
            str2[i] = s;
        }
    }
    public void Sore() throws Exception {
        int i,j;
        for (i=0;i< str1.length;i++){

            for (j=0;j<str1.length;j++){}
        }

    }
    public  void output(){

    }

}

