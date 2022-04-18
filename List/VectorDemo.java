import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        System.out.println(v.capacity());
        for (int i = 0; i <= 10; i++) {
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.addElement("A");
        System.out.println(v.capacity());
        System.out.println(v);

        // v.add(e);
        // v.add(index, element);
        // v.addAll(c);
        // v.addAll(index, c);
        // v.addElement(obj);
        // v.addFirst(e);
        // v.addLast(e);
        // v.capacity();
        // v.clear();
        // v.clone();
        // v.contains(o);
        // v.containsAll(c);
        // // v.descendingIterator();
        // // v.element();
        // v.equals(o);
        // v.forEach(action);
        // v.get(index);
        // v.getClass();
        // // v.getFirst();
        // // v.getLast();
        // v.hashCode();
        // v.indexOf(o);
        // v.isEmpty();
        // v.iterator();
        // v.lastIndexOf(o);
        // v.listIterator();
        // v.listIterator(index);
        // v.notify();
        // v.notifyAll();
        // v.offer(e);
        // v.offerFirst(e);
        // v.offerLast(e);
        // v.parallelStream();
        // v.push(e);
        // // v.remove();
        // v.remove(o);
        // v.remove(index);
        // v.removeAll(c);
        // // v.removeFirst();
        // v.removeFirstOccurrence(o);
        // v.removeIf(filter);
        // // v.removeLast();
        // v.removeLastOccurrence(o);
        // v.replaceAll(operator);
        // v.retainAll(c);
        // v.set(index, element);
        // v.size();
        // v.sort(c);
        // v.spliterator();
        // v.stream();
        // v.subList(fromIndex, toIndex);
        // v.toArray();
        // v.toArray(generator);
        // v.toArray(a);
        // v.toString();
        // v.wait();
        // v.wait(timeoutMillis);
        // v.wait(timeoutMillis, nanos);
    }
}
