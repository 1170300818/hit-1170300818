package dadaw;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/**
*this class is designed for iterator learning.
*/
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
  }
}
