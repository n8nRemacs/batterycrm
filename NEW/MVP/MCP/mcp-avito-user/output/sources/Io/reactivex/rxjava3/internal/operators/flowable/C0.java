package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.AbstractC41777j;

/* compiled from: FlowableJust.java */
/* loaded from: classes8.dex */
public final class C0<T> extends AbstractC41777j<T> implements q41.e<T> {

    /* renamed from: c, reason: collision with root package name */
    public final T f402295c;

    public C0(T t12) {
        this.f402295c = t12;
    }

    @Override // l41.s
    public final T get() {
        return this.f402295c;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        dVar.K(new o41.g(this.f402295c, dVar));
    }
}
