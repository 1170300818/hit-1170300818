package dadaw;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JustForUse {
  public static void main(String[] args) {
    List<Integer> temp = new LinkedList<>();
    temp.add(3);
    temp.add(10);
    Iterator<Integer> iter = temp.iterator();
    while (iter.hasNext()) {
      Integer line = iter.next();
      if (line.equals(3)) {
        iter.remove();
      }
    }
    System.out.println("3 has removed");
  }
}
