package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class s0 extends AtomicReference implements py4 {
    public static final FutureTask d;
    public static final FutureTask o;
    public final Runnable a;
    public final boolean b;
    public Thread c;

    static {
        o6 o6Var = pdf.c;
        d = new FutureTask(o6Var, null);
        o = new FutureTask(o6Var, null);
    }

    public s0(Runnable runnable, boolean z) {
        this.a = runnable;
        this.b = z;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == d) {
                return;
            }
            if (future2 == o) {
                if (this.c == Thread.currentThread()) {
                    future.cancel(false);
                    return;
                } else {
                    future.cancel(this.b);
                    return;
                }
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // defpackage.py4
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == d || future == (futureTask = o) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        if (this.c == Thread.currentThread()) {
            future.cancel(false);
        } else {
            future.cancel(this.b);
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        Future future = (Future) get();
        return future == d || future == o;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Future future = (Future) get();
        if (future == d) {
            str = "Finished";
        } else if (future == o) {
            str = "Disposed";
        } else if (this.c != null) {
            str = "Running on " + this.c;
        } else {
            str = "Waiting";
        }
        return getClass().getSimpleName() + "[" + str + "]";
    }
}
