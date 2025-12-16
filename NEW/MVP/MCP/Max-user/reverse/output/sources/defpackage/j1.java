package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class j1 extends yoi {
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;

    public j1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.e = atomicReferenceFieldUpdater;
        this.f = atomicReferenceFieldUpdater2;
        this.g = atomicReferenceFieldUpdater3;
        this.h = atomicReferenceFieldUpdater4;
        this.i = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.yoi
    public final boolean a(y1 y1Var, h1 h1Var, h1 h1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(y1Var, h1Var, h1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(y1Var) == h1Var);
        return false;
    }

    @Override // defpackage.yoi
    public final boolean b(y1 y1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(y1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(y1Var) == obj);
        return false;
    }

    @Override // defpackage.yoi
    public final boolean c(y1 y1Var, w1 w1Var, w1 w1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.g;
            if (atomicReferenceFieldUpdater.compareAndSet(y1Var, w1Var, w1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(y1Var) == w1Var);
        return false;
    }

    @Override // defpackage.yoi
    public final void g(w1 w1Var, w1 w1Var2) {
        this.f.lazySet(w1Var, w1Var2);
    }

    @Override // defpackage.yoi
    public final void h(w1 w1Var, Thread thread) {
        this.e.lazySet(w1Var, thread);
    }
}
