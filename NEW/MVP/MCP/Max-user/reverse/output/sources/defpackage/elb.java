package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class elb implements Handler.Callback {
    public static final ExecutorService c;
    public static final ThreadLocal d;
    public final ExecutorService a = c;
    public final b7d b;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        c = executorServiceNewSingleThreadExecutor;
        d = new ThreadLocal();
        executorServiceNewSingleThreadExecutor.execute(new mc(12));
    }

    public elb(b7d b7dVar) {
        this.b = b7dVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        w9i w9iVar = (w9i) message.obj;
        if (!w9iVar.c) {
            w9iVar.d++;
            this.b.log(hcf.app_event, "rtc.long.executor.task." + w9iVar.d, w9iVar.a);
            if (w9iVar.d < 4) {
                throw new IllegalStateException("No task duration check thread");
            }
        }
        return true;
    }
}
