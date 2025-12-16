package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class i1 extends woi {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public i1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.woi
    public final boolean a(x1 x1Var, g1 g1Var, g1 g1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(x1Var, g1Var, g1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(x1Var) == g1Var);
        return false;
    }

    @Override // defpackage.woi
    public final boolean b(x1 x1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(x1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(x1Var) == obj);
        return false;
    }

    @Override // defpackage.woi
    public final boolean c(x1 x1Var, v1 v1Var, v1 v1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(x1Var, v1Var, v1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(x1Var) == v1Var);
        return false;
    }

    @Override // defpackage.woi
    public final g1 e(x1 x1Var) {
        return (g1) this.d.getAndSet(x1Var, g1.d);
    }

    @Override // defpackage.woi
    public final v1 f(x1 x1Var) {
        return (v1) this.c.getAndSet(x1Var, v1.c);
    }

    @Override // defpackage.woi
    public final void g(v1 v1Var, v1 v1Var2) {
        this.b.lazySet(v1Var, v1Var2);
    }

    @Override // defpackage.woi
    public final void h(v1 v1Var, Thread thread) {
        this.a.lazySet(v1Var, thread);
    }
}
