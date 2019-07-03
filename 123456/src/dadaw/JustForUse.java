package dadaw;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JustForUse {
  public static void main(String[] args) {

    List<Integer> asd = new LinkedList<>();
    asd.add(3);
    asd.add(10);
    Iterator<Integer> iter = asd.iterator();
    while (iter.hasNext()) {
      Integer line = iter.next();
      if (line.equals(3)) {
        iter.remove();
      }
    }
  }

}
