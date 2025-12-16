package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class wu1 implements ha8 {
    public final WeakReference a;
    public final vu1 b = new vu1(this);

    public wu1(tu1 tu1Var) {
        this.a = new WeakReference(tu1Var);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        tu1 tu1Var = (tu1) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (zCancel && tu1Var != null) {
            tu1Var.a = null;
            tu1Var.b = null;
            tu1Var.c.l(null);
        }
        return zCancel;
    }

    @Override // defpackage.ha8
    public final void d(Runnable runnable, Executor executor) {
        this.b.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.a instanceof e4;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
