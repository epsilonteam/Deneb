package net.spartanb312.cursa.core.concurrent.blocking;

import net.spartanb312.cursa.core.concurrent.task.VoidTask;

public class BlockingJob implements Runnable {

    private final VoidTask task;
    private final BlockingContext content;

    public BlockingJob(VoidTask task, BlockingContext content) {
        this.task = task;
        this.content = content;
    }

    @Override
    public void run() {
        try {
            task.invoke();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        content.count();
        content.countDown();
    }

}
