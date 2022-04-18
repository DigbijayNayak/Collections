import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        a.add("A");
        a.add(10);
        a.add("A");
        a.add(null);
        System.out.println(a);// [A, 10, A, null]
        a.remove(2);
        System.out.println(a);// [A, 10, null]
        a.add(2, "m");
        a.add("n");
        System.out.println(a);// [A, 10, m, null, n]
        // a.add(e);
        // a.add(index, element);
        // a.addAll(c);
        // a.addAll(c)
        // a.addAll(index, c);
        // a.clear();
        // a.clone();
        // a.contains(o);
        // a.containsAll(c);
        // a.ensureCapacity(minCapacity);
        // a.equals(o);
        // a.forEach(action);
        // a.get(index);
        // a.getClass();
        // a.hashCode();
        // a.indexOf(o);
        // a.isEmpty();
        // a.iterator();
        // a.lastIndexOf(o);
        // a.listIterator();
        // a.listIterator(index);
        // a.notify();
        // a.notifyAll();
        // a.parallelStream();
        // a.remove(o);
        // a.remove(index);
        // a.removeAll(c);
        // a.removeIf(filter);
        // a.replaceAll(operator);
        // a.retainAll(c);
        // a.set(index, element);
        // a.size();
        // a.sort(c);
        // a.spliterator();
        // a.stream();
        // a.subList(fromIndex, toIndex);
        // a.toArray();
        // a.toArray(generator);
        // a.toArray(a);
        // a.toString();
        // a.trimToSize();
        // a.wait();
        // a.wait(timeoutMillis);
        // a.wait(timeoutMillis, nanos);

    }
}
