package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class osa extends AtomicReference implements py4, Runnable {
    public final vta a;
    public long b;

    public osa(vta vtaVar) {
        this.a = vtaVar;
    }

    @Override // defpackage.py4
    public final void dispose() {
        ty4.a(this);
    }

    @Override // defpackage.py4
    public final boolean e() {
        return get() == ty4.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != ty4.a) {
            long j = this.b;
            this.b = 1 + j;
            this.a.f(Long.valueOf(j));
        }
    }
}
