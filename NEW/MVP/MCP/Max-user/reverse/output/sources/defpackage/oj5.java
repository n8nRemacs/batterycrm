package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class oj5 extends AtomicInteger implements Runnable, py4 {
    public final Runnable a;
    public final qy4 b;
    public volatile Thread c;

    public oj5(Runnable runnable, qy4 qy4Var) {
        this.a = runnable;
        this.b = qy4Var;
    }

    @Override // defpackage.py4
    public final void dispose() {
        while (true) {
            int i = get();
            if (i >= 2) {
                return;
            }
            if (i == 0) {
                if (compareAndSet(0, 4)) {
                    qy4 qy4Var = this.b;
                    if (qy4Var != null) {
                        qy4Var.c(this);
                        return;
                    }
                    return;
                }
            } else if (compareAndSet(1, 3)) {
                Thread thread = this.c;
                if (thread != null) {
                    thread.interrupt();
                    this.c = null;
                }
                set(4);
                qy4 qy4Var2 = this.b;
                if (qy4Var2 != null) {
                    qy4Var2.c(this);
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return get() >= 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0) {
            this.c = Thread.currentThread();
            if (!compareAndSet(0, 1)) {
                this.c = null;
                return;
            }
            try {
                this.a.run();
                this.c = null;
                if (!compareAndSet(1, 2)) {
                    while (get() == 3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                } else {
                    qy4 qy4Var = this.b;
                    if (qy4Var != null) {
                        qy4Var.c(this);
                    }
                }
            } catch (Throwable th) {
                try {
                    t8j.a(th);
                    throw th;
                } catch (Throwable th2) {
                    this.c = null;
                    if (compareAndSet(1, 2)) {
                        qy4 qy4Var2 = this.b;
                        if (qy4Var2 != null) {
                            qy4Var2.c(this);
                        }
                    } else {
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    }
                    throw th2;
                }
            }
        }
    }
}
