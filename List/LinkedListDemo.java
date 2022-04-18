import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("bhaskar");
        l.add(30);
        l.add(null);
        l.add("bhaskar");
        System.out.println(l);// [bhaskar, 30, null, bhaskar]
        l.set(0, "software");
        System.out.println(l);// [software, 30, null, bhaskar]
        l.set(0, "venky");
        System.out.println(l);// [venky, 30, null, bhaskar]
        l.removeLast();
        System.out.println(l);// [venky, 30, null]
        l.addFirst("vvv");
        System.out.println(l);// [vvv, venky, 30, null9]

        // l.add(e);
        // l.add(index, element);
        // l.addAll(c);
        // l.addAll(index, c);
        // l.addFirst(e);
        // l.addLast(e);
        // l.clear();
        // l.clone();
        // l.contains(o);
        // l.containsAll(c);
        // l.descendingIterator();
        // l.element();
        // l.equals(o);
        // l.forEach(action);
        // l.get(index);
        // l.getClass();
        // l.getFirst();
        // l.getLast();
        // l.hashCode();
        // l.indexOf(o);
        // l.isEmpty();
        // l.iterator();
        // l.lastIndexOf(o);
        // l.listIterator();
        // l.listIterator(index);
        // l.notify();
        // l.notifyAll();
        // l.offer(e);
        // l.offerFirst(e);
        // l.offerLast(e);
        // l.parallelStream();
        // l.peek();
        // l.peekFirst();
        // l.peekLast();
        // l.poll();
        // l.pollFirst();
        // l.pollLast();
        // l.pop();
        // l.push(e);
        // l.remove();
        // l.remove(o);
        // l.remove(index);
        // l.removeAll(c);
        // l.removeFirst();
        // l.removeFirstOccurrence(o);
        // l.removeIf(filter);
        // l.removeLast();
        // l.removeLastOccurrence(o);
        // l.replaceAll(operator);
        // l.retainAll(c);
        // l.set(index, element);
        // l.size();
        // l.sort(c);
        // l.spliterator();
        // l.stream();
        // l.subList(fromIndex, toIndex);
        // l.toArray();
        // l.toArray(generator);
        // l.toArray(a);
        // l.toString();
        // l.wait();
        // l.wait(timeoutMillis);
        // l.wait(timeoutMillis, nanos);

    }
}
