package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: ObservableHide.java */
/* renamed from: io.reactivex.rxjava3.internal.operators.observable.q0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41981q0<T> extends AbstractC41932a<T, T> {

    /* compiled from: ObservableHide.java */
    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.q0$a */
    public static final class a<T> implements io.reactivex.rxjava3.core.G<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.G<? super T> f404244b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404245c;

        public a(io.reactivex.rxjava3.core.G<? super T> g12) {
            this.f404244b = g12;
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404245c, dVar)) {
                this.f404245c = dVar;
                this.f404244b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f404245c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void e() {
            this.f404244b.e();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f404245c.i();
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onError(Throwable th2) {
            this.f404244b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.G
        public final void onNext(T t12) {
            this.f404244b.onNext(t12);
        }
    }

    public C41981q0(io.reactivex.rxjava3.core.E<T> e12) {
        super(e12);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403951b.c(new a(g12));
    }
}
