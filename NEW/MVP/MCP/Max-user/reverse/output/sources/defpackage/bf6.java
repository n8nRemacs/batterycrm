package defpackage;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class bf6 extends ForkJoinTask {
    public final u02 a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicReference c;
    public volatile Throwable d;

    public bf6(String str, u02 u02Var) {
        this.a = u02Var;
        this.c = new AtomicReference(str);
    }

    @Override // java.util.concurrent.ForkJoinTask
    public final boolean exec() {
        if (!this.b.compareAndSet(false, true)) {
            return false;
        }
        try {
            this.a.run();
            return true;
        } catch (Throwable th) {
            this.d = th;
            throw th;
        }
    }

    @Override // java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return this.c.get();
    }

    @Override // java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        this.c.set(obj);
    }
}
