package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: ObservableCount.java */
/* loaded from: classes8.dex */
public final class A<T> extends AbstractC41932a<T, Long> {

    /* compiled from: ObservableCount.java */
    public static final class a implements io.reactivex.rxjava3.core.G<Object>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super Long> f403495b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403496c;

        /* renamed from: d, reason: collision with root package name */
        public long f403497d;

        public a(io.reactivex.rxjava3.core.G<? super Long> g12) {
            this.f403495b = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403496c, dVar)) {
                this.f403496c = dVar;
                this.f403495b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403496c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            Long lValueOf = Long.valueOf(this.f403497d);
            io.reactivex.rxjava3.core.G<? super Long> g12 = this.f403495b;
            g12.onNext(lValueOf);
            g12.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f403496c.i();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f403495b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(Object obj) {
            this.f403497d++;
        }
    }

    public A() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super Long> g12) {
        this.f403951b.c(new a(g12));
    }
}
