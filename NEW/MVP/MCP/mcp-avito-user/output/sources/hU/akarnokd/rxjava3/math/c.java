package hu.akarnokd.rxjava3.math;

import io.reactivex.rxjava3.core.InterfaceC41782o;

/* compiled from: FlowableMinMax.java */
/* loaded from: classes8.dex */
final class c<T> extends d<T, T> {

    /* compiled from: FlowableMinMax.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.h<T, T> {
        private static final long serialVersionUID = 600979972678601618L;

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            try {
                if (this.f404783e) {
                    throw null;
                }
                this.f419377c = t12;
                this.f404783e = true;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404782d.cancel();
                this.f419376b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
