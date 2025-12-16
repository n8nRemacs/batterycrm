package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* compiled from: MaybeIsEmpty.java */
/* loaded from: classes8.dex */
public final class U<T> extends AbstractC41907a<T, Boolean> {

    /* compiled from: MaybeIsEmpty.java */
    public static final class a<T> implements io.reactivex.rxjava3.core.t<T>, io.reactivex.rxjava3.disposables.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.core.t<? super Boolean> f403179b;

        /* renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f403180c;

        public a(io.reactivex.rxjava3.core.t<? super Boolean> tVar) {
            this.f403179b = tVar;
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void b(io.reactivex.rxjava3.disposables.d dVar) {
            if (DisposableHelper.f(this.f403180c, dVar)) {
                this.f403180c = dVar;
                this.f403179b.b(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f403180c.dispose();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void e() {
            this.f403179b.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final boolean i() {
            return this.f403180c.i();
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onError(Throwable th2) {
            this.f403179b.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.t
        public final void onSuccess(T t12) {
            this.f403179b.onSuccess(Boolean.FALSE);
        }
    }

    public U() {
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void o(io.reactivex.rxjava3.core.t<? super Boolean> tVar) {
        this.f403189b.a(new a(tVar));
    }
}
