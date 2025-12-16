package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class fjg extends AtomicReference implements Runnable {
    public static final o6 c;
    public static final o6 d;
    public final Callable a;
    public final /* synthetic */ gjg b;

    static {
        int i = 4;
        c = new o6(i);
        d = new o6(i);
    }

    public fjg(gjg gjgVar, Callable callable) {
        this.b = gjgVar;
        callable.getClass();
        this.a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        bq7 bq7Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof bq7;
            o6 o6Var = d;
            if (!z2 && runnable != o6Var) {
                break;
            }
            if (z2) {
                bq7Var = (bq7) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == o6Var || compareAndSet(runnable, o6Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(bq7Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objCall = null;
        if (compareAndSet(null, threadCurrentThread)) {
            gjg gjgVar = this.b;
            boolean zIsDone = gjgVar.isDone();
            o6 o6Var = c;
            if (!zIsDone) {
                try {
                    objCall = this.a.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, o6Var)) {
                            a(threadCurrentThread);
                        }
                        if (zIsDone) {
                            return;
                        }
                        gjgVar.l(th);
                        return;
                    } finally {
                        if (!compareAndSet(threadCurrentThread, o6Var)) {
                            a(threadCurrentThread);
                        }
                        if (!zIsDone) {
                            gjgVar.k(null);
                        }
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == c) {
            str = "running=[DONE]";
        } else if (runnable instanceof bq7) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbO = ho7.o(str, ", ");
        sbO.append(this.a.toString());
        return sbO.toString();
    }
}
