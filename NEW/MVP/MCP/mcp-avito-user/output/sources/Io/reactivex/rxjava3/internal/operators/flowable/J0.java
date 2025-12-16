package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;
import s41.C47998a;

/* compiled from: FlowableMaterialize.java */
/* loaded from: classes8.dex */
public final class J0<T> extends AbstractC41833b<T, io.reactivex.rxjava3.core.y<T>> {

    /* compiled from: FlowableMaterialize.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.u<T, io.reactivex.rxjava3.core.y<T>> {
        private static final long serialVersionUID = -3740826063558713822L;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.u
        public final void c(Object obj) {
            io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) obj;
            if (NotificationLite.i(yVar.f401975a)) {
                C47998a.b(yVar.b());
            }
        }

        @Override // org.reactivestreams.d
        public final void e() {
            a(io.reactivex.rxjava3.core.y.f401974b);
        }

        @Override // org.reactivestreams.d
        public final void onError(Throwable th2) {
            a(io.reactivex.rxjava3.core.y.a(th2));
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            this.f404804e++;
            Objects.requireNonNull(t12, "value is null");
            this.f404801b.onNext(new io.reactivex.rxjava3.core.y(t12));
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super io.reactivex.rxjava3.core.y<T>> dVar) {
        this.f402624c.q(new a((InterfaceC41782o) dVar));
    }
}
