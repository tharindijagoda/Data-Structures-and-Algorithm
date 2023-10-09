import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] array = new int[]{10,20,30,40,50};
        array[0] = 100;
        System.out.println(array[0]);

        int[] array2 = new int[]{10,20,30,40,50};
        for (int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }

        List<String> list = new LinkedList<String>();
        list.add("mango");
        list.add("apple");
        list.add("grapes");
        list.add("banana");
        System.out.println(list);
        for (String fruit:list) {
            System.out.println(fruit);
        }

        Deque<String> stack = new LinkedList<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        System.out.println(stack);

        Queue<String> queue = new ArrayDeque<>();
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");

        System.out.println(queue);
        System.out.println(queue.poll());

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(30);
        treeSet.add(1);//this not be added, set hold unique values
        System.out.println(treeSet);

        Set<String> words = new TreeSet<>(Comparator.comparing(String::length));
        words.add("dog");
        words.add("wolf");
        words.add("cat");// not be added, string length equal with dog
        words.add("elephant");
        System.out.println(words);

        Map<String,Integer> marks = new HashMap<>();
        marks.put("Saman",10);
        marks.put("kamal",60);

        for(Map.Entry<String,Integer> mark : marks.entrySet()){
            System.out.println(mark.getKey()+" "+mark.getValue());
        }




    }
}