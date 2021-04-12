import java.util.ArrayList;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
            int[] sizes = new int[] {1000, 2000, 5000};
            System.out.println("------------------------------------------------");
            System.out.println("| Method  |  Size  | ArrayList |  LinkedList   |");

            for (int i = 0; i < 3; i++) {
                System.out.println();
                System.out.println("------------------------------------------------");


                LinkedList<Integer> linkedList = new LinkedList<>();
                ArrayList<Integer> arrayList = new ArrayList<>();

                System.out.printf("Add   \t\t%d \t\t%d \t\t%d \t   |", sizes[ i ], new TimeTester().addList(arrayList, sizes[ i ]), new TimeTester().addList(linkedList, sizes[ i ]));
                System.out.println();
                System.out.printf("Get   \t\t%d \t\t%d \t\t%d    |", sizes[ i ], new TimeTester().getList(arrayList, sizes[ i ]), new TimeTester().getList(linkedList, sizes[ i ]));
                System.out.println();
                System.out.printf("Remove\t\t%dl \t\t%d \t\t%d \t   |", sizes[ i ], new TimeTester().removeList(arrayList, sizes[ i ]), new TimeTester().removeList(linkedList, sizes[ i ]));
                System.out.println();
                System.out.println("------------------------------------------------");
                System.out.println();
            }
    }
}
