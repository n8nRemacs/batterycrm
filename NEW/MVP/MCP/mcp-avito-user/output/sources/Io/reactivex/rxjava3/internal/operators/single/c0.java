package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: SingleToObservable.java */
/* loaded from: classes8.dex */
public final class c0<T> extends io.reactivex.rxjava3.core.z<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.I f404565b;

    /* compiled from: SingleToObservable.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.observers.n<T> implements io.reactivex.rxjava3.core.L<T> {
        private static final long serialVersionUID = 3786543492451018833L;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f404566d;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.L
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f404566d, dVar)) {
                this.f404566d = dVar;
                this.f402118b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.n, io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            super.dispose();
            this.f404566d.dispose();
        }
    }

    public c0(io.reactivex.rxjava3.core.I i12) {
        this.f404565b = i12;
    }

    public static <T> io.reactivex.rxjava3.core.L<T> M0(io.reactivex.rxjava3.core.G<? super T> g12) {
        return new a(g12);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f404565b.a(new a(g12));
    }
}
