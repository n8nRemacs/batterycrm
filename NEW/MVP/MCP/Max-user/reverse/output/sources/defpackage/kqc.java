package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class kqc extends AtomicBoolean implements py4 {
    public final vta a;
    public final lqc b;

    public kqc(vta vtaVar, lqc lqcVar) {
        this.a = vtaVar;
        this.b = lqcVar;
    }

    @Override // defpackage.py4
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.b.t(this);
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return get();
    }
}
