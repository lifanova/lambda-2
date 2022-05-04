/**
 * Created by Vera Lifanova (U_062QE)
 * Date: 04.05.2022
 */

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener error;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener error) {
        this.callback = callback;
        this.error = error;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 32) {
                error.onError("Task " + i + " is failed");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
