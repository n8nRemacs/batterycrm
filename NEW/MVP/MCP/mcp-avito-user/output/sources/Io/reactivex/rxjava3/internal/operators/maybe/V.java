package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import n41.InterfaceC44187d;
import n41.InterfaceC44190g;

/* compiled from: MaybeIsEmptySingle.java */
/* loaded from: classes8.dex */
public final class V<T> extends io.reactivex.rxjava3.core.I<Boolean> implements InterfaceC44190g<T>, InterfaceC44187d<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final g0 f403181b;

    /* compiled from: MaybeIsEmptySingle.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.L<? super Boolean> f403182b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403183c;

        public a(io.reactivex.rxjava3.core.L<? super Boolean> l12) {
            this.f403182b = l12;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403183c, dVar)) {
                this.f403183c = dVar;
                this.f403182b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403183c.dispose();
            this.f403183c = DisposableHelper.f401986b;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403183c = DisposableHelper.f401986b;
            this.f403182b.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return this.f403183c.getF318621e();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403183c = DisposableHelper.f401986b;
            this.f403182b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403183c = DisposableHelper.f401986b;
            this.f403182b.onSuccess(Boolean.FALSE);
        }
    }

    public V(g0 g0Var) {
        this.f403181b = g0Var;
    }

    @Override // n41.InterfaceC44187d
    public final io.reactivex.rxjava3.core.q<Boolean> c() {
        return new U(this.f403181b);
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super Boolean> l12) {
        this.f403181b.a(new a(l12));
    }
}
