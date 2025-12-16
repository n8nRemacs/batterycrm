package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.AbstractC41777j;
import q41.InterfaceC47198a;

/* compiled from: FlowableMapOptional.java */
/* loaded from: classes8.dex */
public final class j<T, R> extends AbstractC41777j<R> {

    /* compiled from: FlowableMapOptional.java */
    public static final class a<T, R> extends io.reactivex.rxjava3.internal.subscribers.a<T, R> {
        public a() {
            throw null;
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f404772e) {
                return true;
            }
            if (this.f404773f != 0) {
                this.f404769b.onNext(null);
                return true;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                a(th2);
                return true;
            }
        }

        @Override // q41.g
        public final R poll() {
            if (this.f404771d.poll() == null) {
                return null;
            }
            throw null;
        }
    }

    /* compiled from: FlowableMapOptional.java */
    public static final class b<T, R> extends io.reactivex.rxjava3.internal.subscribers.b<T, R> implements InterfaceC47198a<T> {
        public b() {
            throw null;
        }

        @Override // q41.InterfaceC47198a
        public final boolean P(T t12) {
            if (this.f404777e) {
                return true;
            }
            if (this.f404778f != 0) {
                this.f404774b.onNext(null);
                return true;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                a(th2);
                return true;
            }
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            P(t12);
        }

        @Override // q41.g
        public final R poll() {
            if (this.f404776d.poll() == null) {
                return null;
            }
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super R> dVar) {
        if (!(dVar instanceof InterfaceC47198a)) {
            throw null;
        }
        throw null;
    }
}
