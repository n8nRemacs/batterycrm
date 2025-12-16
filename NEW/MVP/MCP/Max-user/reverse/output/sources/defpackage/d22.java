package defpackage;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final /* synthetic */ class d22 implements RejectedExecutionHandler {
    public final /* synthetic */ int a;

    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) throws InterruptedException {
        switch (this.a) {
            case 0:
                gri.b("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
                break;
            default:
                try {
                    threadPoolExecutor.getQueue().put(runnable);
                    break;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                    return;
                }
        }
    }
}
