import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        Random random = new Random();
        int[] array = new int[]{random.nextInt(10)};
        ArrayList<Integer> arrayList = getRandomArrayList(10);
        LinkedList<Integer> linkedList = getRandomLinkedList(10);

        sort(array);
        sort(arrayList);
        sort(linkedList);

        System.out.println("Sort array: " + Arrays.toString(array));
        System.out.println("Sort ArrayList: " + arrayList);
        System.out.println("Sort LinkedList: " + linkedList);
    }


    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void sort(LinkedList<Integer> list) {
        Collections.sort(list);
    }


    public static ArrayList<Integer> getRandomArrayList(int length) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(2));
        }
        return list;
    }

    public static LinkedList<Integer> getRandomLinkedList(int length) {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(2));
        }
        return list;
    }
}