package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class ns7 implements Executor {
    public static volatile ns7 c;
    public final /* synthetic */ int a;
    public final Object b;

    public ns7(ExecutorService executorService) {
        this.a = 2;
        this.b = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((ExecutorService) this.b).execute(runnable);
                break;
            case 1:
                ((Handler) this.b).post(runnable);
                break;
            case 2:
                ((Executor) this.b).execute(new twd(runnable, 0));
                break;
            default:
                ((y1a) this.b).post(runnable);
                break;
        }
    }

    public ns7(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new Handler(Looper.getMainLooper());
                break;
            case 2:
            default:
                this.b = Executors.newFixedThreadPool(2, new h30(3));
                break;
            case 3:
                y1a y1aVar = new y1a(Looper.getMainLooper(), 3, false);
                Looper.getMainLooper();
                this.b = y1aVar;
                break;
        }
    }
}
