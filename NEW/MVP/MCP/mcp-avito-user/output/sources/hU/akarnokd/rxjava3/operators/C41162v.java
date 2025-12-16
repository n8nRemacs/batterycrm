package hu.akarnokd.rxjava3.operators;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.InterfaceC41782o;
import io.reactivex.rxjava3.core.InterfaceC41783p;

/* compiled from: FlowableIndexOf.java */
/* renamed from: hu.akarnokd.rxjava3.operators.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41162v<T> extends AbstractC41777j<Long> implements InterfaceC41783p<T, Long> {

    /* compiled from: FlowableIndexOf.java */
    /* renamed from: hu.akarnokd.rxjava3.operators.v$a */
    public static final class a<T> extends io.reactivex.rxjava3.internal.subscribers.h<T, Long> {
        private static final long serialVersionUID = 4809092721669178986L;

        /* renamed from: f, reason: collision with root package name */
        public boolean f398161f;

        @Override // io.reactivex.rxjava3.internal.subscribers.h, org.reactivestreams.d
        public final void e() {
            if (this.f398161f) {
                return;
            }
            l(-1L);
        }

        @Override // org.reactivestreams.d
        public final void onNext(T t12) {
            try {
                throw null;
            } catch (Throwable th2) {
                io.reactivex.rxjava3.exceptions.a.a(th2);
                this.f398161f = true;
                this.f404782d.cancel();
                onError(th2);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super Long> dVar) {
        new a((InterfaceC41782o) dVar);
        throw null;
    }
}
