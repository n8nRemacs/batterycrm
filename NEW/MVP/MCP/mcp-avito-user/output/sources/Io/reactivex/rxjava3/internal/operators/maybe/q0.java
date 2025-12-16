package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import n41.InterfaceC44190g;

/* compiled from: MaybeToFlowable.java */
/* loaded from: classes8.dex */
public final class q0<T> extends AbstractC41777j<T> implements InterfaceC44190g<T> {

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.w<T> f403307c;

    /* compiled from: MaybeToFlowable.java */
    public static final class a<T> extends o41.f<T> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403308d;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403308d, dVar)) {
                this.f403308d = dVar;
                this.f419376b.K(this);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f403308d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f419376b.e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f419376b.onError(th2);
        }
    }

    public q0(io.reactivex.rxjava3.core.w<T> wVar) {
        this.f403307c = wVar;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f403307c.a(new a(dVar));
    }
}
