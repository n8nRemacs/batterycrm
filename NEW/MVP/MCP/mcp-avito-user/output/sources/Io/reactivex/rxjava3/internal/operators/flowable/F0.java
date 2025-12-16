package io.reactivex.rxjava3.internal.operators.flowable;

import s41.C47998a;

/* compiled from: FlowableLift.java */
/* loaded from: classes8.dex */
public final class F0<R, T> extends AbstractC41833b<T, R> {
    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        try {
            throw null;
        } catch (NullPointerException e12) {
            throw e12;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            C47998a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }
}
