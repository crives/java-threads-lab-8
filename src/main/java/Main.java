import java.util.List;
import java.util.concurrent.Future;

/*
Implement the countFinishedFutures which takes in a List of
Future objects and counts how many of the objects completed.
 */
public class Main {
    static int count = 0;
    public static int countFinishedFutures(List<Future> futures) {
        futures.forEach((future) -> {
            if (future.isDone()) {
                count++;
            }
        });
        return count;
    }
}