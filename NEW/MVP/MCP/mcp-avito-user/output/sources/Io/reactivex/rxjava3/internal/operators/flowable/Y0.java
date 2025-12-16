package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* compiled from: FlowableOnErrorReturn.java */
/* loaded from: classes8.dex */
public final class Y0<T> extends AbstractC41833b<T, T> {

    /* compiled from: FlowableOnErrorReturn.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.u<T, T> {
        private static final long serialVersionUID = -3740826063558713822L;

        @Override // org.reactivestreams.d
        public final void e() {
            this.f404801b.e();
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            try {
                throw null;
            } catch (Throwable th3) {
                io.reactivex.rxjava3.exceptions.a.a(th3);
                this.f404801b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f404804e++;
            this.f404801b.onNext(t12);
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
