package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class pac extends o0 implements sac, n92 {
    public final pv0 a;

    public pac(x74 x74Var, pv0 pv0Var) {
        super(x74Var, true, true);
        this.a = pv0Var;
    }

    public final boolean D(Throwable th) {
        return this.a.j(th, false);
    }

    public final void E(z11 z11Var) {
        pv0 pv0Var = this.a;
        pv0Var.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = pv0.t0;
        while (!atomicReferenceFieldUpdater.compareAndSet(pv0Var, null, z11Var)) {
            if (atomicReferenceFieldUpdater.get(pv0Var) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(pv0Var);
                    Symbol symbol = rv0.q;
                    if (obj != symbol) {
                        if (obj == rv0.r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    Symbol symbol2 = rv0.r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(pv0Var, symbol, symbol2)) {
                        if (atomicReferenceFieldUpdater.get(pv0Var) != symbol) {
                            break;
                        }
                    }
                    z11Var.invoke(pv0Var.p());
                    return;
                }
            }
        }
    }

    @Override // defpackage.ccd
    public final ibe a() {
        return this.a.a();
    }

    @Override // defpackage.ccd
    public final Object b() {
        return this.a.b();
    }

    @Override // defpackage.su7, defpackage.qt7
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cancellationException);
    }

    @Override // defpackage.su7
    public final void cancelInternal(Throwable th) {
        CancellationException cancellationException$default = su7.toCancellationException$default(this, th, null, 1, null);
        this.a.cancel(cancellationException$default);
        cancelCoroutine(cancellationException$default);
    }

    @Override // defpackage.cde
    public final Object g(Object obj) {
        return this.a.g(obj);
    }

    @Override // defpackage.cde
    public final Object h(Object obj, Continuation continuation) {
        return this.a.h(obj, continuation);
    }

    @Override // defpackage.ccd
    public final kv0 iterator() {
        pv0 pv0Var = this.a;
        pv0Var.getClass();
        return new kv0(pv0Var);
    }

    @Override // defpackage.ccd
    public final Object k(wf3 wf3Var) {
        pv0 pv0Var = this.a;
        pv0Var.getClass();
        return pv0.B(pv0Var, wf3Var);
    }

    @Override // defpackage.o0
    public final void onCancelled(Throwable th, boolean z) {
        if (this.a.j(th, false) || z) {
            return;
        }
        b7j.c(getContext(), th);
    }

    @Override // defpackage.o0
    public final void onCompleted(Object obj) {
        this.a.i(null);
    }

    @Override // defpackage.su7
    public final /* synthetic */ void cancel() {
        cancelInternal(new JobCancellationException(cancellationExceptionMessage(), null, this));
    }

    @Override // defpackage.su7
    public final /* synthetic */ boolean cancel(Throwable th) {
        cancelInternal(new JobCancellationException(cancellationExceptionMessage(), null, this));
        return true;
    }
}
