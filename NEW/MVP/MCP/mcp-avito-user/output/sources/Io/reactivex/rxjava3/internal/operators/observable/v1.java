package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: ObservableTakeLastOne.java */
/* loaded from: classes8.dex */
public final class v1<T> extends AbstractC41932a<T, T> {

    /* compiled from: ObservableTakeLastOne.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404371b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404372c;

        /* renamed from: d, reason: collision with root package name */
        public T f404373d;

        public a(io.reactivex.rxjava3.core.G<? super T> g12) {
            this.f404371b = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404372c, dVar)) {
                this.f404372c = dVar;
                this.f404371b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404373d = null;
            this.f404372c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            T t12 = this.f404373d;
            io.reactivex.rxjava3.core.G<? super T> g12 = this.f404371b;
            if (t12 != null) {
                this.f404373d = null;
                g12.onNext(t12);
            }
            g12.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f404372c.i();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404373d = null;
            this.f404371b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f404373d = t12;
        }
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12));
    }
}
