package com.google.common.util.concurrent;

import com.google.common.util.concurrent.D;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ClosingFuture.java */
/* loaded from: classes6.dex */
class M implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f360533b;

    public M(D d12) {
        this.f360533b = d12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D.n nVar = D.n.f360525d;
        D.n nVar2 = D.n.f360526e;
        Logger logger = D.f360502d;
        D d12 = this.f360533b;
        AtomicReference<D.n> atomicReference = d12.f360503a;
        while (!atomicReference.compareAndSet(nVar, nVar2)) {
            if (atomicReference.get() != nVar) {
                throw new IllegalStateException(com.google.common.base.d0.b("Expected state to be %s, but it was %s", nVar, nVar2));
            }
        }
        D.f360502d.log(Level.FINER, "closing {0}", d12);
        d12.f360504b.close();
        D.n nVar3 = D.n.f360527f;
        while (!atomicReference.compareAndSet(nVar2, nVar3)) {
            if (atomicReference.get() != nVar2) {
                throw new IllegalStateException(com.google.common.base.d0.b("Expected state to be %s, but it was %s", nVar2, nVar3));
            }
        }
    }
}
