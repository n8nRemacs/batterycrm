package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class sn6 implements ha8 {
    public final ha8 a;
    public tu1 b;

    public sn6(ha8 ha8Var) {
        ha8Var.getClass();
        this.a = ha8Var;
    }

    public static sn6 a(ha8 ha8Var) {
        return ha8Var instanceof sn6 ? (sn6) ha8Var : new sn6(ha8Var);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.ha8
    public final void d(Runnable runnable, Executor executor) {
        this.a.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }

    public sn6() {
        this.a = ixi.a(new r5j(20, this));
    }
}
