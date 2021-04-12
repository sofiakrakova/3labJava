import java.util.List;
public class TimeTester
 {
     public static <T> long addList(List <T>list, int size)
     {
        long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            Object obj = i;
            list.add((T) obj);
        }
        return  System.nanoTime() - start;

    }
     public static <T> long getList(List <T>list, int size)
     {
         long start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            T a =  list.get(i);
        }
         return  System.nanoTime() - start;
    }

     public static <T> long removeList(List <T>list, int size)
     {
        long start = System.nanoTime();
        for (int i = size - 1; i >= 0; i--) {
            list.remove(i);
        }
         return  System.nanoTime() - start;
    }

}