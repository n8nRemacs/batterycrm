package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableOnBackpressureReduce.java */
/* loaded from: classes8.dex */
public final class U0<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableOnBackpressureReduce.java */
    public static final class a<T> extends AbstractC41830a<T, T> {
        private static final long serialVersionUID = 821363947659780367L;

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            AtomicReference<R> atomicReference = this.f402595h;
            Object andSet = atomicReference.get();
            if (andSet != null) {
                andSet = atomicReference.getAndSet(null);
            }
            if (andSet == null) {
                atomicReference.lazySet(t12);
                b();
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402590c.cancel();
                onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(@j41.e org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
