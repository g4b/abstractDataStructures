import java.util.*;

public class Arrays {

    public int[] array;
    public ArrayList<Integer> arrayList;

    public Arrays(int[] array, ArrayList<Integer> arrayList){
        this.array = array;
        this.arrayList = arrayList;
    }
    public static void main(String[] args){
        int[] array = {1, 2, 3};
        ArrayList<Integer> arrayList = new ArrayList<Integer>(3);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        Arrays arrays = new Arrays(array, arrayList);
        for (int i = 0; i < 3; i++){
            System.out.println(arrays.array[i]);
            System.out.println(arrays.arrayList.get(i));
        }
    }
}
