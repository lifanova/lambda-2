/**
 * Created by Vera Lifanova
 * Date: 04.05.2022
 */

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;

        Worker worker = new Worker(listener);
        worker.start();
    }
}
