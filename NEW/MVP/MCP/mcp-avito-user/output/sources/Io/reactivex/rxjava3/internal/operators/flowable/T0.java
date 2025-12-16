package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;

/* compiled from: FlowableOnBackpressureLatest.java */
/* loaded from: classes8.dex */
public final class T0<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableOnBackpressureLatest.java */
    public static final class a<T> extends AbstractC41830a<T, T> {
        private static final long serialVersionUID = 163080509307634843L;

        public a() {
            throw null;
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f402595h.lazySet(t12);
            b();
        }
    }

    public T0(C41876p0 c41876p0) {
        super(c41876p0);
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
