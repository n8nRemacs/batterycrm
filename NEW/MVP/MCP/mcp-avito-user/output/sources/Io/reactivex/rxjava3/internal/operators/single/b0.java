package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: SingleToFlowable.java */
/* loaded from: classes8.dex */
public final class b0<T> extends AbstractC41777j<T> {

    /* renamed from: c, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.O<? extends T> f404563c;

    /* compiled from: SingleToFlowable.java */
    public static final class a<T> extends o41.f<T> implements io.reactivex.rxjava3.core.L<T> {
        private static final long serialVersionUID = 187782011903685568L;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404564d;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404564d, dVar)) {
                this.f404564d = dVar;
                this.f419376b.K(this);
            }
        }

        @Override // o41.f, org.reactivestreams.e
        public final void cancel() {
            super.cancel();
            this.f404564d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void onError(Throwable th2) {
            this.f419376b.onError(th2);
        }
    }

    public b0(io.reactivex.rxjava3.core.O<? extends T> o12) {
        this.f404563c = o12;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC41777j
    public final void u(org.reactivestreams.d<? super T> dVar) {
        this.f404563c.a(new a(dVar));
    }
}
