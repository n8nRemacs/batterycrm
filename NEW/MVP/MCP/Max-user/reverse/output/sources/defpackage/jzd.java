package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class jzd extends s0 implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = s0.d;
        this.c = Thread.currentThread();
        try {
            try {
                this.a.run();
                return null;
            } finally {
                lazySet(futureTask);
                this.c = null;
            }
        } catch (Throwable th) {
            t8j.a(th);
            throw th;
        }
    }
}
