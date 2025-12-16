package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class bo0 implements Executor {
    public static volatile bo0 c;
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ bo0(Handler handler, int i) {
        this.a = i;
        this.b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((Handler) this.b).post(runnable);
                return;
            case 1:
                Handler handler = (Handler) this.b;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 2:
                ((Handler) this.b).post(runnable);
                return;
            default:
                ((ExecutorService) this.b).execute(runnable);
                return;
        }
    }

    public bo0(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = Executors.newSingleThreadExecutor(new q27(0));
                break;
            default:
                this.b = new Handler(Looper.getMainLooper());
                break;
        }
    }
}
