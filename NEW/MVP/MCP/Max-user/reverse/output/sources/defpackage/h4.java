package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class h4 extends gpi {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public h4(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.gpi
    public final boolean a(k4 k4Var, g4 g4Var, g4 g4Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.d;
            if (atomicReferenceFieldUpdater.compareAndSet(k4Var, g4Var, g4Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k4Var) == g4Var);
        return false;
    }

    @Override // defpackage.gpi
    public final boolean b(k4 k4Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(k4Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k4Var) == obj);
        return false;
    }

    @Override // defpackage.gpi
    public final boolean c(k4 k4Var, j4 j4Var, j4 j4Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.c;
            if (atomicReferenceFieldUpdater.compareAndSet(k4Var, j4Var, j4Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k4Var) == j4Var);
        return false;
    }

    @Override // defpackage.gpi
    public final void f(j4 j4Var, j4 j4Var2) {
        this.b.lazySet(j4Var, j4Var2);
    }

    @Override // defpackage.gpi
    public final void g(j4 j4Var, Thread thread) {
        this.a.lazySet(j4Var, thread);
    }
}
