package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import n41.InterfaceC44190g;

/* compiled from: MaybeToObservable.java */
/* loaded from: classes8.dex */
public final class r0<T> extends io.reactivex.rxjava3.core.z<T> implements InterfaceC44190g<T> {

    /* renamed from: b, reason: collision with root package name */
    public final io.reactivex.rxjava3.core.q f403313b;

    /* compiled from: MaybeToObservable.java */
    public static final class a<T> extends io.reactivex.rxjava3.internal.observers.n<T> implements io.reactivex.rxjava3.core.t<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: d, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403314d;

        public a() {
            throw null;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403314d, dVar)) {
                this.f403314d = dVar;
                this.f402118b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.n, io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            super.dispose();
            this.f403314d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            if ((get() & 54) != 0) {
                return;
            }
            lazySet(2);
            this.f402118b.e();
        }
    }

    public r0(io.reactivex.rxjava3.core.q qVar) {
        this.f403313b = qVar;
    }

    public static <T> io.reactivex.rxjava3.core.t<T> M0(io.reactivex.rxjava3.core.G<? super T> g12) {
        return new a(g12);
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super T> g12) {
        this.f403313b.a(new a(g12));
    }
}
