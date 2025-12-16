package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class js7 extends du7 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(js7.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final em6 b;

    public js7(em6 em6Var) {
        this.b = em6Var;
    }

    @Override // defpackage.du7
    public final boolean c() {
        return true;
    }

    @Override // defpackage.du7
    public final void d(Throwable th) {
        if (c.compareAndSet(this, 0, 1)) {
            this.b.invoke(th);
        }
    }
}
