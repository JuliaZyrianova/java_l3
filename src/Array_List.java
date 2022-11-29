import java.util.ArrayList;
/**
 *Class, where there is a finding of the operating time of the functions ArrayList
 */
public class Array_List {
    /**
     *field is List based on ArrayList
     * */
    ArrayList<Integer> arrayList;

    /**
     * Constructor - creating list
     */
    public Array_List(){
        arrayList=new ArrayList<>();
    }

    public Array_List(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    /**
     * the function in which the time of the adding all elements method
     * @return time work function add 1000000 elements
     */
    public long get_time_add() {
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        long t = end - begin;
        return t;
    }

    /**
     * the function in which the time of the remove all elements method
     * @return time work function remove 5000 elements
     */
    public long get_time_remove_all() {
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            arrayList.remove(i);
        }
        long end = System.currentTimeMillis();
        long t = end - begin;
        return t;
    }

    /**
     * the function in which the time of the delete first element method
     * @return time work function delete 0 element
     */
    public long get_time_delete_first() {
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i);
        }
        long begin = System.currentTimeMillis();
        arrayList.remove(0);
        long end = System.currentTimeMillis();
        long t = end - begin;
        return t;
    }

    /**
     * the function in which the time of the delete last element method
     * @return time work function delete 1000000 element
     */
    public long get_time_delete_last() {
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long begin = System.currentTimeMillis();
        arrayList.remove(arrayList.size()-1);
        long end = System.currentTimeMillis();
        long t = end - begin;
        return t;
    }
    /**
     * the function in which the time of the get first element method
     * @return time work function get 0 element
     */
    public long time_to_get_first() {
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i);
        }
        long begin = System.currentTimeMillis();
        arrayList.get(0);
        long end = System.currentTimeMillis();
        long t = end - begin;
        return t;
    }

    /**
     * the function in which the time of the get last element method
     * @return time work function get 1000000 element
     */
    public long time_to_get_last() {
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long begin = System.currentTimeMillis();
        arrayList.get(arrayList.size()-1);
        long end = System.currentTimeMillis();
        long t = end - begin;
        return t;
    }
    /**
     * the function in which the time of the get middle element method
     * @return time work function get 500000 element
     */
    public long time_to_get_middle() {
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long begin = System.currentTimeMillis();
        arrayList.get(arrayList.size()/2-1);
        long end = System.currentTimeMillis();
        long t = end - begin;
        return t;
    }
}
