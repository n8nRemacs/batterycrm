package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import s41.C47998a;

/* compiled from: FlowableFromCallable.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.l0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41864l0<T> extends AbstractC41777j<T> implements l41.s<T> {
    public C41864l0() {
        throw null;
    }

    @Override // l41.s
    public final T get() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        o41.f fVar = new o41.f(dVar);
        dVar.K(fVar);
        try {
            throw null;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            if (fVar.m()) {
                C47998a.b(th2);
            } else {
                dVar.onError(th2);
            }
        }
    }
}
