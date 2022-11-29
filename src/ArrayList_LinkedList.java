import java.util.ArrayList;
import java.util.LinkedList;
/**
 * Laboratory work 3
 * <p>
 * the program compares java collection ArrayList and LinkedList methods by speed of action
 * @author Julia Zyrianova
 * @version 1.0
 */
public class ArrayList_LinkedList {

    public static void print(String str1,String str2,long t1, long t2) {
        System.out.println();
        System.out.format("%32s%12s%20d%20d", str1,str2,t1,t2);
    }

    public static void main(String[] args) {

        /** The main method of the program.
         * where a comparison table with the main methods is displayed on the screen
         */

        Linked_List list=new Linked_List();
        Array_List array=new Array_List();

        System.out.format("%35s%10s%20s%20s"," ","count","time_ArrayList_ms", "time_LinkedList_ms");
        System.out.println();

        long t1= array.get_time_add();
        long t2=list.get_time_add();
        print("1.add ","1000000",t1,t2);

        t1=array.get_time_remove_all();
        t2=list.get_time_remove_all();
        print("2.remove all ","5000",t1,t2);

        t1=array.get_time_delete_first();
        t2=list.get_time_delete_first();
        print("3.delete first ","10000000",t1,t2);

        t1=array.get_time_delete_last();
        t2=list.get_time_delete_last();
        print("4.delete last ","1000000",t1,t2);

        t1=array.time_to_get_first();
        t2=list.time_to_get_first();
        print("5.get first ","1000000",t1,t2);

        t1=array.time_to_get_last();
        t2=list.time_to_get_last();
        print("6.get last ","1000000",t1,t2);

        t1=array.time_to_get_middle();
        t2=list.time_to_get_middle();
        print("7.get middle ","1000000",t1,t2);

    }
}
