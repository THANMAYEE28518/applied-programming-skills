import java.util.*;

class RecentCounter {

    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {

        // Add the new request
        queue.offer(t);

        // Remove requests outside [t - 3000, t]
        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        // Number of requests in the valid range
        return queue.size();
    }
}