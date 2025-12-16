package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.exceptions.CompositeException;

/* compiled from: FlowableMapNotification.java */
/* loaded from: classes8.dex */
public final class H0<T, R> extends AbstractC41833b<T, R> {

    /* compiled from: FlowableMapNotification.java */
    public static final class a<T, R> extends io.reactivex.rxjava3.internal.subscribers.u<T, R> {
        private static final long serialVersionUID = 2757120512858778108L;

        @Override // org.reactivestreams.d
        public final void e() {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404801b.onError(th2);
            }
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
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f404801b.onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
