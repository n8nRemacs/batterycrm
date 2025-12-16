package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;
import java.util.concurrent.Future;

/* compiled from: FlowableFromFuture.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.flowable.n0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41870n0<T> extends AbstractC41777j<T> {

    /* renamed from: c, reason: collision with root package name */
    public final Future<? extends T> f402900c;

    public C41870n0(Future future) {
        this.f402900c = future;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        o41.f fVar = new o41.f(dVar);
        dVar.K(fVar);
        try {
            T t12 = this.f402900c.get();
            if (t12 == null) {
                dVar.onError(io.reactivex.rxjava3.internal.util.h.b("The future returned a null value."));
            } else {
                fVar.l(t12);
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            if (fVar.m()) {
                return;
            }
            dVar.onError(th2);
        }
    }
}
