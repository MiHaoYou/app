package Y;
import java.io.*;
import java.util.*;
public class CeShi {
    String str = new String();
    String[] str1,str3;
    int n = 0;
    char aChar[];
    char[] chars = new char[100];
    public static void main(String[] args) throws Exception {
        CeShi y = new CeShi();
        y.Input();
        y.Cycle_Shift();
        y.Sore();
        y.Output();
    }

    public void Input() throws Exception {
        FileReader fin = new FileReader("D:\\A.txt");
        n = fin.read(chars);
        str = new String(chars);
        System.out.println(str);
        fin.close();
    }

    public void Cycle_Shift() throws Exception {
        int i, j;
        String list = null;
        char[] str2 = new char[n];
        for (i = 0; i < str2.length; i++)
            str2[i] = str.charAt(i);
        str = new String(str2);
        str1 = str.split(" ");
        str3 = str1;
        for (i = 0; i < str1.length; i++) {
            list = str1[0];
            for (j = 0; j < str1.length - 1; j++) {
                str1[j] = str1[j + 1];
            }
            str1[str1.length - 1] = list;
            StringBuffer sb = new StringBuffer();
            for (int k = 0; k < str1.length; k++){
                sb.append(str1[k]);
                sb.append(" ");
            }
            String s = sb.toString();
            str3[i] = s;
            System.out.println(s);
        }
    }
    public void Sore(){
        String strings;
        for(int i = 0 ;i<str3.length-1;i++){
            for (int j = i+1;j < str3.length;j++) {
                 int k = i;
                if (str3[k].charAt(0) < str3[j].charAt(0)) {
                    strings = str3[i];
                    str3[j] = strings;
                    str3[k] = str3[j];
                }
            }
        }
    }
    public void Output(){
        for (int i = 0;i < str3.length;i++)
            System.out.println(Arrays.toString(str3));
    }
}

