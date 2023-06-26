import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        Разработать программу, имитирующую поведение коллекции HashSet.
//        В программе содать метод add добавляющий элемент, метод toString возвращающий строку
//        с элементами множества и метод позволяющий читать элементы по индексу.
//        *Реализовать все методы из семинара.
//        Формат данных Integer.

        MySet myObj = new MySet();
        System.out.println(myObj.add(1));
        System.out.println("contains: " + myObj.contains(1));
        System.out.println(myObj.add(2));
        System.out.println(myObj.add(1));
        System.out.println("get: " + myObj.get(1));
        System.out.println("isEmpty: " + myObj.isEmpty());
//        System.out.println(myObj.remove(1));
//        System.out.println(myObj.remove(2));
//        System.out.println(myObj.remove(1));
        System.out.println("isEmpty: " + myObj.isEmpty());
        System.out.println("getAll: " + myObj.getAll());

        Iterator<Integer> iterator = myObj.iterator();
        while(iterator.hasNext()) {
            int i = iterator.next();
            System.out.println(i);
        }
    }
}

class MySet {

    private HashMap<Integer, Object> setObj = new HashMap<>();
    private static final Object MYOBJECT = new Object();
    public boolean add(int elem) {
        return setObj.put(elem, MYOBJECT) == null;
    }
    public boolean remove(int elem) {
        return setObj.remove(elem)==MYOBJECT;
    }
    public boolean isEmpty() {
        return setObj.isEmpty();
    }
    public boolean contains(int key) {
        return setObj.containsKey(key);
    }
    public int get(int id) {
        Object[] keys = setObj.keySet().toArray();
        return (int) keys[id];
    }
    public Iterator<Integer> iterator() {
        return setObj.keySet().iterator();
    }
    public String getAll() {
        return setObj.keySet().toString();
    }
}
