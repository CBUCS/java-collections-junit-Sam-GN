import java.util.ArrayList;

public class main {

    public static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {
        add(1);
    }

    public static boolean add(int a) {
        return list.add(a);
    }

    public static boolean contain(int a) {
        return list.contains(a);
    }

    public static int size() {
        return list.size();
    }

    public static int remove(int index) {
        return list.remove(index);
        /*if (list.contains(a)) {
            list.remove(a);
            return true;
        }
        else
            return false;*/
    }

}
