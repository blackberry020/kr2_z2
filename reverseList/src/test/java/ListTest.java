import org.example.List;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ListTest {

    @Test
    public void creationListTest() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list = new List<Integer>(array);
        list.printList();
    }

    @Test
    public void reverseListTest() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list = new List<Integer>(array);
        list.reverse(list.getHead());
        list.printList();
    }
}
