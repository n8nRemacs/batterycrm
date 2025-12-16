package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: FlowableOnBackpressureReduceWith.java */
/* loaded from: classes8.dex */
public final class V0<T, R> extends AbstractC41833b<T, R> {

    /* compiled from: FlowableOnBackpressureReduceWith.java */
    public static final class a<T, R> extends AbstractC41830a<T, R> {
        private static final long serialVersionUID = 8255923705960622424L;

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            AtomicReference<R> atomicReference = this.f402595h;
            R andSet = atomicReference.get();
            if (andSet != null) {
                andSet = atomicReference.getAndSet(null);
            }
            try {
                if (andSet != null) {
                    throw null;
                }
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f402590c.cancel();
                onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(@j41.e org.reactivestreams.d<? super R> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
